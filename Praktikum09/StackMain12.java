import java.util.Scanner;

public class StackMain12 {
    public static void main(String[] args) {
        StackPakaian12 stk = new StackPakaian12(5);
        Scanner sc = new Scanner(System.in);
        char pilih;
        
        do {
            System.out.println("\nPilih operasi stack:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            System.out.println("");
            
            switch (choice) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();

                    Pakaian12 p = new Pakaian12(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            System.out.print("\nApakah Anda ingin melanjutkan (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine(); // Membuang newline
        } while (pilih == 'y');
    }
}
