import java.util.Scanner;

public class MahasiswaMain12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        Scanner sc12_2 = new Scanner(System.in);

        Mahasiswa12[] mahasiswa12 = new Mahasiswa12[3];

        for (int i = 0; i < mahasiswa12.length; i++) {
            mahasiswa12[i] = new Mahasiswa12();
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan Nama: ");
            mahasiswa12[i].nama = sc12_2.nextLine();
            System.out.print("Masukkan NIM: ");
            mahasiswa12[i].nim = sc12_2.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            mahasiswa12[i].JK = sc12_2.nextLine();
            System.out.print("Masukkan IPK: ");
            mahasiswa12[i].ipk = sc12.nextDouble();
            System.out.println();
        }

        for (Mahasiswa12 mahasiswa : mahasiswa12) {
            System.out.println("Data Mahasiswa");
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("NIM: " + mahasiswa.nim);
            System.out.println("Jenis Kelamin: " + mahasiswa.JK);
            System.out.println("Nilai IPK: " + mahasiswa.ipk);
        }

        // Memanggil method hitungRataRataIpk dan mencetak rata-rata IPK
        double rataRataIpk = mahasiswa12[0].hitungRataRataIpk(mahasiswa12);
        System.out.println("\nRata-rata IPK: " + (float)rataRataIpk);
    }
}