import java.util.Scanner;

public class Pemilihan_12 {

    public static void main(String[] args) {

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        // Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Input nilai dari pengguna
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();

        // Validasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
            return;
        }

        // Hitung nilai akhir
        double totalNilai = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;

        // Konversi nilai huruf dan keterangan
        String nilaiHuruf;

        if (totalNilai >= 80) {
            nilaiHuruf = "A";
        } else if (totalNilai >= 73) {
            nilaiHuruf = "B+";
        } else if (totalNilai >= 65) {
            nilaiHuruf = "B";
        } else if (totalNilai >= 60) {
            nilaiHuruf = "C+";
        } else if (totalNilai >= 50) {
            nilaiHuruf = "C";
        } else if (totalNilai >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Output hasil
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("nilai akhir: " + totalNilai);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("SELAMAT ANDA LULUS" );
    }
}
