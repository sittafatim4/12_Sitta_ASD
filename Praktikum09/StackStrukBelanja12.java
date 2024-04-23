import java.util.Scanner;
import java.util.Stack;
public class StackStrukBelanja12 {
    public static void main(String[] args) {
        Stack<StruckBelanja12> stackStrukBelanja = new Stack<>();
        Scanner sc = new Scanner(System.in);

        stackStrukBelanja.push(new StruckBelanja12("001", "2022-04-03", 10, 500000));
        stackStrukBelanja.push(new StruckBelanja12("002", "2022-04-10", 8, 400000));
        stackStrukBelanja.push(new StruckBelanja12("003", "2022-04-17", 5, 300000));
        stackStrukBelanja.push(new StruckBelanja12("004", "2022-04-24", 12, 600000));
        stackStrukBelanja.push(new StruckBelanja12("005", "2022-05-01", 7, 350000));
        stackStrukBelanja.push(new StruckBelanja12("006", "2022-05-08", 9, 450000));
        stackStrukBelanja.push(new StruckBelanja12("007", "2022-05-15", 6, 320000));
        stackStrukBelanja.push(new StruckBelanja12("008", "2022-05-22", 11, 550000));

        System.out.println("=================================================");
        System.out.println("Informasi Struk Belanja yang Masih Tersimpan:");
        System.out.println("=================================================");
        for (StruckBelanja12 strukBelanja : stackStrukBelanja) {
            System.out.println(strukBelanja.toString());
        }
        boolean lanjutkan = true;
        while (lanjutkan) {
            System.out.println();
            System.out.println("===============================================================");
            System.out.print("Masukkan nomor transaksi struk yang ingin ditukarkan: ");
            String nomorTransaksiInput = sc.nextLine();
            System.out.println("===============================================================");
            boolean found = false;
            for (StruckBelanja12 struk : stackStrukBelanja) {
                if (struk.getNomorTransaksi().equals(nomorTransaksiInput)) {
                    stackStrukBelanja.remove(struk);
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Struk dengan nomor transaksi " + nomorTransaksiInput + " telah berhasil ditukarkan dengan voucher.");
                System.out.println();
            } else {
                System.out.println("Struk dengan nomor transaksi " + nomorTransaksiInput + " tidak ditemukan dalam daftar.");
                System.out.println();
            }

            System.out.print("Apakah Anda ingin melanjutkan pertukaran? (ya/tidak): ");
            String lanjutkanInput = sc.nextLine();
            if (!lanjutkanInput.equalsIgnoreCase("ya")) {
                lanjutkan = false;
            }
        }
        System.out.println();
        System.out.println("===============================================================");
        System.out.println("Informasi Struk Belanja yang Masih Tersimpan:");
        System.out.println("===============================================================");
        for (StruckBelanja12 strukBelanja : stackStrukBelanja) {
            System.out.println(strukBelanja.toString() + "\n");
        }
    }
}