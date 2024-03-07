import java.util.ArrayList;
import java.util.Scanner;

class TransaksiBarang12 {
    ArrayList<Barang12> barangs = new ArrayList<>();

    public void tambahBarang(Barang12 barang) {
        barangs.add(barang);
    }

    public void tampilkanBarang() {
        System.out.println("=======================");
        System.out.println("Daftar Barang");
        System.out.println("=======================");
        System.out.println("Kode\tNama\tHarga\tStok");
        for (Barang12 barang : barangs) {
            System.out.println(barang.getKode() + "\t" + barang.getNama() + "\t" + barang.getHarga() + "\t" + barang.getStok());
        }
    }

    public boolean melakukanPembelian(String kodeBarang, ArrayList<Barang12> pembelianHariIni) {
        for (Barang12 barang : barangs) {
            if (barang.getKode().equals(kodeBarang)) {
                if (barang.getStok() > 0) {
                    pembelianHariIni.add(barang); // Menambahkan barang yang dibeli ke dalam daftar belanjaan hari ini
                    barang.setStok(barang.getStok() - 1);
                    return true;
                } else {
                    System.out.println("Stok barang habis.");
                    return false;
                }
            }
        }
        System.out.println("Barang tidak ditemukan.");
        return false;
    }

    public void tampilkanBarangPembelian() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilkanBarangPembelian'");
    }

    public void melakukanPembelian(String kodeBarang) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'melakukanPembelian'");
    }

    public void melakukanPembelian(String kodeBarang) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'melakukanPembelian'");
    }
}