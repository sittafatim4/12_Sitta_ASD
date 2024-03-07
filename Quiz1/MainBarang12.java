import java.util.ArrayList;
import java.util.Scanner;

public class MainBarang12 {
    public static void main(String[] args) {
        TransaksiBarang12 transaksi = new TransaksiBarang12();

        // Inisialisasi data barang
        transaksi.tambahBarang(new Barang12("K01", "Sabun", 1000, 5));
        transaksi.tambahBarang(new Barang12("K02", "Pasta Gigi", 2000, 10));
        transaksi.tambahBarang(new Barang12("K03", "Biore", 3000, 23));
        transaksi.tambahBarang(new Barang12("K04", "Shampoo", 4000, 55));
        transaksi.tambahBarang(new Barang12("K05", "Sikat Gigi", 5000, 65));
        ArrayList<Barang12> pembelianHariIni = new ArrayList<>();
        System.out.println("=======================");
        System.out.println("TOKO MAJU MUNDUR CANTIK");
        System.out.println("=======================");
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis(); // Waktu awal
        while (true) {
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");

            System.out.print("Pilih[1-4]: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                transaksi.tampilkanBarang();
                System.out.println();
                continue; // Kembali ke awal loop untuk memilih menu lagi
            } else if (pilihan.equals("2")) {
                transaksi.tampilkanBarang();
                System.out.println();
                do {
                    System.out.print("Masukkan Kode Barang: ");
                    String kodeBarang = scanner.nextLine();
                    transaksi.melakukanPembelian(kodeBarang, pembelianHariIni);

                    System.out.print("Apakah akan belanja kembali (Y/N): ");
                    String belanjaLagi = scanner.nextLine();
                    if (!belanjaLagi.equalsIgnoreCase("Y")) {
                        break; // Jika tidak ingin belanja kembali, keluar dari loop
                    }
                } while (true);  
                System.out.println();
                continue; // Kembali ke awal loop untuk memilih menu lagi
            } else if (pilihan.equals("3")) {
                System.out.println("=======================");
                System.out.println("List Belanjaan");
                System.out.println("=======================");
                System.out.println("Kode\tNama\tHarga");
                for (Barang12 barang : pembelianHariIni) {
                    System.out.println(barang.getKode() + "\t" + barang.getNama() + "\t" + barang.getHarga());
                }
                System.out.println();
                continue; // Kembali ke awal loop untuk memilih menu lagi
            } else if (pilihan.equals("4")) {
                long endTime = System.currentTimeMillis(); // Waktu akhir
                long totalTime = endTime - startTime; // Menghitung total waktu
                System.out.println("\u001B[32mBUILD SUCCESSFUL"); // Warna hijau
                System.out.println("total time: " + totalTime / 1000 + " second"); // Konversi dari milidetik ke detik
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}

