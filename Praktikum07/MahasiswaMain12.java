import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class MahasiswaMain12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();

        PencarianMhs12 data = new PencarianMhs12(jumMhs);

        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil: ");
        for(int i = 0; i < jumMhs; i++) {
        System.out.println("---------------------");
        System.out.print("Nim\t: ");
        int nim = s.nextInt();
        System.out.print("Nama\t: ");
        String nama = sl.nextLine();
        System.out.print("Umur\t: ");
        int umur = s.nextInt();
        System.out.print("IPK\t: ");
        double ipk = s.nextDouble();

        Mahasiswa12 m = new Mahasiswa12(nim, nama, umur, ipk);
        data.tambah(m);

        }

        System.out.println("----------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("_________________________________________________");
        System.out.println("_________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("===============================");
        System.out.println("menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    } 
}