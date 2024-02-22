public class BukuMain12 {
    public static void main(String[] args) {
        
        Buku12 bk1 = new Buku12();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1. tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku12 bk2 = new Buku12 ("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku12 bukuSitta = new Buku12("What If", "Fatima Sitta", 170, 50, 98000);
        bukuSitta.terjual(35);
        bukuSitta.tampilInformasi();

        int jumlahTerjual = 10;
        int hargaTotal = bukuSitta.hitungHargaTotal(jumlahTerjual);
        int diskon = bukuSitta.hitungDiskon(hargaTotal);
        int hargaBayar = bukuSitta.hitungHargaBayar(hargaTotal, diskon);

        System.out.println("Jumlah terjual : " + jumlahTerjual);
        System.out.println("Harga total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);
    }
    }
