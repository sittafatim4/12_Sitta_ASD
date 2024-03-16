import java.util.Scanner;
public class MainSum12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc12.nextInt();
        Sum12 sm = new Sum12(elm);
        System.out.println("=====================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke- " + (i + 1) + " = ");
            sm.keuntungan[i] = sc12.nextDouble();
        }
        System.out.println("=====================================================");
        System.out.println("Algoritma Brute Force");
        double totalBF = sm.totalBF(sm.keuntungan);
        System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f \n", sm.elemen, totalBF);
        System.out.println("=====================================================");
        System.out.println("Algoritma Divide Conquer");
        double totalDC = sm.totalDC(sm.keuntungan, 0, sm.elemen - 1);
        System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f \n", sm.elemen, totalDC);
        System.out.println("=====================================================");
    }
}