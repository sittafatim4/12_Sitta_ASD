import java.util.Scanner;

public class Perulangan_12 {

    public static void main(String[] args) {

        // Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM :");
        long nim = scanner.nextLong();

        // Dapatkan 2 digit terakhir NIM
        int n = (int) (nim % 100);

        // Tambahkan 10 jika n kurang dari 10
        if (n < 10) {
            n += 10;
        }
        System.out.println("======================");
        System.out.println("n : " +n);
        // Cetak deretan bilangan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
