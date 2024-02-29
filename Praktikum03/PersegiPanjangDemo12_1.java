import java.util.Scanner;
public class PersegiPanjangDemo12_1 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        PersegiPanjang12_1[] arrayOfPersegiPanjang = new PersegiPanjang12_1[3];

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i] = new PersegiPanjang12_1();

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            arrayOfPersegiPanjang[i].panjang = sc12.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayOfPersegiPanjang[i].lebar = sc12.nextInt();
        }
        
    for (int i = 0; i < 3; i++) {
        System.out.println("Persegi panjang ke-" + (i + 1));
        arrayOfPersegiPanjang[i].cetakInfo();
    }
    }
}