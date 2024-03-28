public class PencarianMhs12_1 {
    Mahasiswa12_1 listMhs[] = new Mahasiswa12_1[5];
    int idx;

    PencarianMhs12_1(int jumlahMahasiswa) {
        listMhs = new Mahasiswa12_1[jumlahMahasiswa];
        idx = 0;
    }
    void tambah(Mahasiswa12_1 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa12_1 m : listMhs) {
            m.tampil();
            System.out.println("--------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            int compareResult = cari.compareTo(listMhs[mid].nama);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(String cari, int pos) {
        if (pos != -1) {
            System.out.println("Data " + cari + " ditemukan pada indeks " + (pos + 1));
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }

    public void TampilData(String cari, int pos) {
        if (pos != -1) {
            int startIdx = pos;
            int endIdx = pos;

            while (startIdx >= 0 && listMhs[endIdx].nama.equals(cari)) {
                startIdx--;
            }
            startIdx++;

            while (endIdx < idx && listMhs[endIdx].nama.equals(cari)) {
                endIdx++;
            }
            endIdx--;

            if (startIdx != endIdx) {
                System.out.println("Peringatan: lebih dari satu mahasiswa dengan nama " + cari + " ditemukan.");
            }

            for(int i = startIdx; i <= endIdx; i++) {
                System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + cari);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
            System.out.println("===============================");
            }
        } else {
            System.out.println("data " + cari + "tidak ditemukan");
        }
    }
}