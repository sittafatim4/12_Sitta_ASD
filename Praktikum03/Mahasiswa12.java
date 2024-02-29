public class Mahasiswa12 {
    String nama, JK;
    String nim;
    double ipk;
    int jmlLength;

    public Mahasiswa12(){

    }

    public double rataRataIpk(int jumlah) {
        double jml = jumlah;
        double total = ipk += ipk / jmlLength;
        return total;
    }
    public double hitungRataRataIpk(Mahasiswa12[] mahasiswa) {
        double totalIpk = 0;
        for (Mahasiswa12 mahasiswa12 : mahasiswa) {
            totalIpk += mahasiswa12.ipk;
        }
        return totalIpk / mahasiswa.length;
    }

}