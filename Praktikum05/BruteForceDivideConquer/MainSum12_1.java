import java.util.Scanner;

public class MainSum12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = scanner.nextInt();

        // Array untuk menyimpan keuntungan perusahaan-perusahaan
        double[][] keuntunganPerusahaan = new double[jumlahPerusahaan][];

        // Memasukkan keuntungan perusahaan untuk setiap bulan
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int jumlahBulan = scanner.nextInt();

            keuntunganPerusahaan[i] = new double[jumlahBulan];

            System.out.println("Masukkan keuntungan perusahaan ke-" + (i + 1) + " untuk setiap bulan:");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Bulan ke-" + (j + 1) + ": ");
                keuntunganPerusahaan[i][j] = scanner.nextDouble();
            }
        }

        // Menghitung total keuntungan untuk setiap perusahaan
        for (int i = 0; i < jumlahPerusahaan; i++) {
            Sum12 sm = new Sum12(keuntunganPerusahaan[i].length);
            sm.keuntungan = keuntunganPerusahaan[i];
            double totalBF = sm.totalBF(sm.keuntungan);
            double totalDC = sm.totalDC(sm.keuntungan, 0, sm.elemen - 1);
            System.out.printf("Total keuntungan perusahaan ke-%d selama %d bulan (Brute Force) adalah = %.2f\n", (i + 1), sm.elemen, totalBF);
            System.out.printf("Total keuntungan perusahaan ke-%d selama %d bulan (Divide Conquer) adalah = %.2f\n", (i + 1), sm.elemen, totalDC);
        }
    }
}
