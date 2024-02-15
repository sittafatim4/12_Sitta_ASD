import java.util.Scanner;

public class Tugas2_12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        while (true) {
            System.out.println("--------MENU---------");
            System.out.println("1. Menghitung Kecepatan");
            System.out.println("2. Menghitung Jarak");
            System.out.println("3. Menghitung Waktu");
            System.out.print("Pilih menu 1-3: ");

            char menu = input12.next().charAt(0);

            switch (menu) {
                case '1':
                    hitungKecepatan();
                    break;
                case '2':
                    hitungJarak();
                    break;
                case '3':
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        }
    }

    static void hitungKecepatan() {
        Scanner input12 = new Scanner(System.in);
        System.out.print("Masukkan Jarak (s): ");
        double jarak = input12.nextDouble();
        System.out.print("Masukkan Waktu (t): ");
        double waktu = input12.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Hasil Perhitungan Kecepatan (v): " + kecepatan + " m/s");
        System.out.println("===================================");
        System.out.println("");
    }

    static void hitungJarak() {
        Scanner input12 = new Scanner(System.in);
        System.out.print("Masukkan Kecepatan (v): ");
        double kecepatan = input12.nextDouble();
        System.out.print("Masukkan Waktu (t): ");
        double waktu = input12.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Hasil Perhitungan Jarak (s): " + jarak + " meter");
        System.out.println("===================================");
        System.out.println("");
    }

    static void hitungWaktu() {
        Scanner input12 = new Scanner(System.in);
        System.out.print("Masukkan Jarak (s): ");
        double jarak = input12.nextDouble();
        System.out.print("Masukkan Kecepatan (v): ");
        double kecepatan = input12.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Hasil Perhitungan Waktu (t): " + waktu + " detik");
        System.out.println("===================================");
        System.out.println("");
    }
}