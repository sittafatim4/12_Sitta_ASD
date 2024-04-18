public class Transaksi12 {
    private double saldo;
    private double saldoAwal;
    private double saldoAkhir;
    private String tanggalTransaksi;
    private String noRekening; 

    public Transaksi12(double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String noRekening) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoAwal() {
        return saldoAwal;
    }

    public double getSaldoAkhir() {
        return saldoAkhir;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-15s %s", saldo, saldoAwal, saldoAkhir, tanggalTransaksi);
    }
}