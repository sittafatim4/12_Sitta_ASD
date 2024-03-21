class HotelService12 {
    Hotel12[] rooms;
    int count;

    HotelService12(int size) {
        rooms = new Hotel12[size];
        count = 0;
    }

    void tambah(Hotel12 h) {
        if (count < rooms.length) {
            rooms[count] = h;
            count++;
        } else {
            System.out.println("Tidak dapat menambahkan hotel, kapasitas penuh.");
        }
    }

    void tampilAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("Hotel " + rooms[i].nama);
            System.out.println("Kota: " + rooms[i].kota);
            System.out.println("Harga: " + rooms[i].harga);
            System.out.println("Bintang: " + rooms[i].bintang);
            System.out.println("------------------------------");
        }
    }

    void bubbleSortHarga() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel12 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSortBintang() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    Hotel12 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void selectionSortHarga() {
        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (rooms[j].harga < rooms[minIndex].harga) {
                    minIndex = j;
                }
            }
            Hotel12 temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }

    void selectionSortBintang() {
        for (int i = 0; i < count - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (rooms[j].bintang > rooms[maxIndex].bintang) {
                    maxIndex = j;
                }
            }
            Hotel12 temp = rooms[maxIndex];
            rooms[maxIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}
