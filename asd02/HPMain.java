public class HPMain {

    public static void main(String[] args) {
        HP phone1 = new HP();
        phone1.merk = "Samsung";
        phone1.tipe = "S23 Ultra";
        phone1.ukuranLayar = 6.8f;
        phone1.tampilInformasi();
        phone1.cekKondisi(false);
    }
}