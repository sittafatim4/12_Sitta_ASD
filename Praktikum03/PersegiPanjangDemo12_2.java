import java.util.Scanner;
public class PersegiPanjangDemo12_2 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        System.out.print("Masukkan length: ");
        int length = sc12.nextInt();
        PersegiPanjang12_2[] arrayOfPersegiPanjang = new PersegiPanjang12_2[length];
        int panjang, lebar;

        for (int i = 0; i < length; i++) {
            
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc12.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc12.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang12_2(panjang,lebar);
           
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            arrayOfPersegiPanjang[i].cetakInfo();
            int luas = arrayOfPersegiPanjang[i].hitungLuas();
            int keliling = arrayOfPersegiPanjang[i].hitungKeliling();
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
        
    }
}