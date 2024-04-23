import java.util.Scanner;
import java.util.Stack;

class StruckBelanja12 {
    String nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHargaBayar;

    public StruckBelanja12(String nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHargaBayar) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHargaBayar = totalHargaBayar;
    }

    public String toString() {
        return "Nomor Transaksi: " + nomorTransaksi +
                "\nTanggal Pembelian: " + tanggalPembelian +
                "\nJumlah Barang: " + jumlahBarang +
                "\nTotal Harga Bayar: " + totalHargaBayar;
    }

    public String getNomorTransaksi() {
        return nomorTransaksi;
    }
}