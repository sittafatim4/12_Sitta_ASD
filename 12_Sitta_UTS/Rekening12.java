import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rekening12 {
    private String noRekening;
    private String nama;
    private String namaIbu;
    private String phone;
    private String email;

    public Rekening12(String noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("%-18s %-11s %-16s %-17s %s", noRekening, nama, namaIbu, phone, email);
    }

    public Transaksi12 getTransaksiTerbaru(ArrayList<Transaksi12> dataTransaksi) {
        throw new UnsupportedOperationException("Unimplemented method 'getTransaksiTerbaru'");
    }
}