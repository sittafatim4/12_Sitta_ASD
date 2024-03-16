public class Pangkat12_1 {
    public int nilai, pangkat;

    // Konstruktor untuk menginisialisasi nilai dan pangkat
    public Pangkat12_1(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) // bilangan ganjil
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            else // bilangan genap
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
        }
    }
}
