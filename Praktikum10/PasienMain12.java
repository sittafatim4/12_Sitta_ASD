import java.util.Scanner;
public class PasienMain12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = scanner.nextInt();
        PasienQueue12 antrian = new PasienQueue12(kapasitas);
        
        int pilihan;
        do {
            System.out.println("\nPilih menu:");
            System.out.println("1. Daftar Pasien Baru");
            System.out.println("2. Hapus Pasien");
            System.out.println("3. Lihat Pasien Terdepan");
            System.out.println("4. Lihat Pasien Terbelakang");
            System.out.println("5. Lihat Posisi Pasien");
            System.out.println("6. Lihat Semua Pasien");
            System.out.println("7. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    if (antrian.isFull()) {
                    System.out.println("Mohon maaf, antrian sudah penuh.");
                    } else {
                    scanner.nextLine(); 
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nomor ID: ");
                    int noID = scanner.nextInt();
                    System.out.print("Masukkan jenis kelamin (L/P): ");
                    char jenisKelamin = scanner.next().charAt(0);
                    System.out.print("Masukkan umur: ");
                    int umur = scanner.nextInt();
                    antrian.enqueue(new Pasien12(nama, noID, jenisKelamin, umur));
                    }
                break;
                case 2:
                    Pasien12 pasienKeluar = antrian.dequeue();
                    if (pasienKeluar != null) {
                        System.out.println("Pasien " + pasienKeluar.nama + " telah keluar dari antrian");
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    scanner.nextLine(); 
                    System.out.print("Masukkan nama pasien: ");
                    String namaPasien = scanner.nextLine();
                    antrian.peekPosition(namaPasien);
                    break;
                case 6:
                    antrian.daftarPasien();
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);
    }
}
