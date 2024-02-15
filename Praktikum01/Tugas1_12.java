import java.util.Scanner;

public class Tugas1_12 {

    private static final String[] KODE = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
    private static final String[][] KOTA = {
        {"Banten"},
        {"Jakarta"},
        {"Bandung"},
        {"Cirebon"},
        {"Bogor"},
        {"Pekalongan"},
        {"Semarang"},
        {"Surabaya"},
        {"Malang"},
        {"Tegal"}
    };

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("   Kode Plat Nomor");
        Scanner input12 = new Scanner(System.in);
        System.out.println("======================");

        // Memasukkan input kode plat nomor
        System.out.print("Masukkan kode plat nomor: ");

        String kodePlat = input12.nextLine();

        // Mencari nama kota berdasarkan kode plat
        String namaKota = "";
        for (int i = 0; i < KODE.length; i++) {
            if (kodePlat.startsWith(KODE[i])) {
                namaKota = KOTA[i][0];
                break;
            }
        }

        // Menampilkan hasil dari pencarian
        if (namaKota.isEmpty()) {
            System.out.println("======================");
            System.out.println("Kode plat nomor tidak dapat ditemukan!");
        } else {
            System.out.println("======================");
            System.out.println("Kota : " + namaKota);
            System.out.println("======================");
        }
    }
}