public class PersegiPanjang12_2 {
    public int panjang;
    public int lebar;    
   

    public PersegiPanjang12_2() {

    }
    public PersegiPanjang12_2(int p, int l) {
        panjang = p;
        lebar = l;
    }
    public void cetakInfo() {
        System.out.println("Panjang: " + panjang + ", Lebar: " + lebar);
    }
    public int hitungLuas() {
        return panjang * lebar;
    }
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}