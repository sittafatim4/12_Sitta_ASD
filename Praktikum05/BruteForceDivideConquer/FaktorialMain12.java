import java.util.Scanner;

public class FaktorialMain12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc12.nextInt();
        
        Faktorial12[] fk = new Faktorial12[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial12();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc12.nextInt();
        }
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long startBF = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            int resultBF = fk[i].faktorialBF(fk[i].nilai);
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + resultBF);
        }
        long endBF = System.currentTimeMillis();
        double totalTimeBFSeconds = (endBF - startBF) / 1000.0; // konversi ke detik
        System.out.println("Total waktu eksekusi Brute Force: " + totalTimeBFSeconds + " seconds");
        System.out.println("=====================================================");
        
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        long startDC = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            int resultDC = fk[i].faktorialDC(fk[i].nilai);
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + resultDC);
        }
        long endDC = System.currentTimeMillis();
        double totalTimeDCSeconds = (endDC - startDC) / 1000.0; // konversi ke detik
        System.out.println("Total waktu eksekusi Divide and Conquer: " + totalTimeDCSeconds + " seconds");
        System.out.println("=====================================================");
        
        double totalExecutionTimeSeconds = (endDC - startBF) / 1000.0; // total waktu eksekusi
        System.out.println("Total waktu eksekusi: " + totalExecutionTimeSeconds + " seconds");
    }
}

