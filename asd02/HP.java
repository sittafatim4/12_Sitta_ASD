public class HP {

    String merk;
    String tipe;
    float ukuranLayar;
    int harga;

    void cekKondisi(boolean c) {
        if (c == true)
            System.out.println("HP ini second\n");
        else
            System.out.println("HP ini masih baru\n");
    }
    void tampilInformasi() {

        System.out.printf("HP merk %s tipe %s dengan ukuran layar %.1f\n", merk, tipe, ukuranLayar);
    }

    void mengirimPesan(String pesan, String penerima, String paketData) {
        if (paketData.equalsIgnoreCase("ada")) {
            System.out.printf("Pesan %s berhasil dikirim ke %s", pesan, penerima);
        } else {
            System.out.printf("Pengirim pesan ke %s gagal", penerima);
        }
    }
}