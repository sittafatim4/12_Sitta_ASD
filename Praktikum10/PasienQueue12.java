public class PasienQueue12 {
    Pasien12[] antrian;
    int front;
    int rear;
    int size;
    int max;

    PasienQueue12(int n) {
        max = n;
        antrian = new Pasien12[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Pasien12 pasien) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        antrian[rear] = pasien;
        size++;
        System.out.println("Pasien " + pasien.nama + " telah ditambahkan ke antrian");
    }

    Pasien12 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }

        Pasien12 pasienKeluar = antrian[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        size--;
        System.out.println("Pasien " + pasienKeluar.nama + " telah keluar dari antrian");
        return pasienKeluar;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        int i = front;
        System.out.println("Antrian Pasien:");
        while (i != rear) {
            System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
            i = (i + 1) % max;
        }
        System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Pasien paling depan di antrian: " + antrian[front].nama);
    }

    void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Pasien paling belakang di antrian: " + antrian[rear].nama);
    }

    void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        int posisi = -1;
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            if (antrian[idx].nama.equals(nama)) {
                posisi = i + 1;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Posisi Pasien " + nama + " di antrian: " + posisi);
        } else {
            System.out.println("Pasien " + nama + " tidak ditemukan di antrian");
        }
    }

    void daftarPasien() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        System.out.println("Daftar Pasien di Antrian:");
        int i = front;
        while (i != rear) {
            System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
            i = (i + 1) % max;
        }
        System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
    }
}
