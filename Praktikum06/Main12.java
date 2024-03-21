import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        DaftarMahasiswaBerpestrasi12 list = new DaftarMahasiswaBerpestrasi12();
        Mahasiswa12 m1 = new Mahasiswa12("Nusa", 2017, 25, 3);
        Mahasiswa12 m2 = new Mahasiswa12("Rara", 2012, 19, 4);
        Mahasiswa12 m3 = new Mahasiswa12("Dompu", 2018, 19, 3.5);
        Mahasiswa12 m4 = new Mahasiswa12("Abdul", 2017, 23, 2);
        Mahasiswa12 m5 = new Mahasiswa12("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}