import java.util.Scanner;

public class MainPangkat12_1 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc12.nextInt();
        Pangkat12_1[] png = new Pangkat12_1[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc12.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc12.nextInt();
            // Menggunakan konstruktor untuk menginisialisasi objek Pangkat12
            png[i] = new Pangkat12_1(nilai, pangkat);
        }
        
        // Menu untuk memilih metode
        System.out.println("============================================");
        System.out.println("Pilih metode:");
        System.out.println("1. Pangkat dengan Brute Force");
        System.out.println("2. Pangkat dengan Divide and Conquer");
        System.out.print("Pilihan Anda: ");
        int pilihan = sc12.nextInt();
        
        System.out.println("=====================================================");
        switch (pilihan) {
            case 1:
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        System.out.println("=====================================================");
    }
}
