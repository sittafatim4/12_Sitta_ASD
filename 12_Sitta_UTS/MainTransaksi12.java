import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainTransaksi12 {
    public static void main(String[] args) {
        ArrayList<Rekening12> dataRekening = new ArrayList<>();
        ArrayList<Transaksi12> dataTransaksi = new ArrayList<>();

        long startTime = 0;
        long endTime = 0;

        tambahDataRekening(dataRekening);
        tambahDataTransaksi(dataTransaksi);

        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
            case 1:
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.println(String.format("%-18s %-11s %-16s %-17s %s", "No Rekening", "Nama", "Nama Ibu", "Phone", "Email"));
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                for (Rekening12 rekening : dataRekening) {
                    System.out.println(rekening);
                }
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                break;
            case 2:
            System.out.println();
                System.out.println("---------------------------------------------------------------------");
                System.out.println(String.format("%-10s %-15s %-15s %s", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal Transaksi"));
                System.out.println("---------------------------------------------------------------------");
                for (Transaksi12 transaksi : dataTransaksi) {
                    System.out.println(transaksi);
                }
                System.out.println("---------------------------------------------------------------------");
                break;
            case 3:
            System.out.println();
                cariSaldoLebihDari500K(dataRekening, dataTransaksi);
                break;
            case 4:
            System.out.println();
                Collections.sort(dataRekening, Comparator.comparing(Rekening12::getNama));
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.println("Data rekening setelah diurutkan berdasarkan nama:");
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                for (Rekening12 rekening : dataRekening) {
                    System.out.println(rekening);
                }
                break;
            case 5:
                startTime = System.currentTimeMillis();
                endTime = System.currentTimeMillis();
                long elapsedTime = (endTime - startTime) / 1000; 
                System.out.println("\u001B[32mBUILD SUCCESSFUL (" + elapsedTime + " seconds)\u001B[0m");
                break;
            default:
                System.out.println("Pilihan tidak valid");
            }
        }
    }

    public static void cariSaldoLebihDari500K(ArrayList<Rekening12> dataRekening, ArrayList<Transaksi12> dataTransaksi) {
        System.out.println("\nTransaksi dengan saldo awal > 500000:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println(String.format("%-10s %-15s %-15s %s", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal Transaksi"));
        System.out.println("---------------------------------------------------------------------");
        boolean found = false;
        for (Transaksi12 transaksi : dataTransaksi) {
            if (transaksi.getSaldoAwal() > 500000) {
                System.out.println(transaksi);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada transaksi dengan saldo awal lebih dari 500000");
        }
    }
    
    
    public static Transaksi12 transaksiTerbaru(Rekening12 rekening, ArrayList<Transaksi12> dataTransaksi) {
        Transaksi12 transaksiTerbaru = null;
        for (Transaksi12 transaksi : dataTransaksi) {
            if (transaksi.getNoRekening().equals(rekening.getNoRekening())) {
                if (transaksiTerbaru == null || transaksi.getTanggalTransaksi().compareTo(transaksiTerbaru.getTanggalTransaksi()) > 0) {
                    transaksiTerbaru = transaksi;
                }
            }
        }
        return transaksiTerbaru;
    }

    public static void tambahDataRekening(ArrayList<Rekening12> dataRekening) {
        dataRekening.add(new Rekening12("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"));
        dataRekening.add(new Rekening12("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"));
        dataRekening.add(new Rekening12("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"));
        dataRekening.add(new Rekening12("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"));
        dataRekening.add(new Rekening12("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"));
        dataRekening.add(new Rekening12("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca"));
        dataRekening.add(new Rekening12("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"));
        dataRekening.add(new Rekening12("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"));
        dataRekening.add(new Rekening12("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"));
        dataRekening.add(new Rekening12("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"));
        dataRekening.add(new Rekening12("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"));
        dataRekening.add(new Rekening12("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"));
        dataRekening.add(new Rekening12("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.nett"));
        dataRekening.add(new Rekening12("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu"));
        dataRekening.add(new Rekening12("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk"));
        dataRekening.add(new Rekening12("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca"));
        dataRekening.add(new Rekening12("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"));
        dataRekening.add(new Rekening12("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com"));
        dataRekening.add(new Rekening12("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com"));
    }

    public static void tambahDataTransaksi(ArrayList<Transaksi12> dataTransaksi) {
        dataTransaksi.add(new Transaksi12(898214, 494048, 3587, "2021-03-09 07:54:42", "16030927 3084"));
        dataTransaksi.add(new Transaksi12(205420, 200162, 775880, "2021-06-25 10:23:00", "16100617 0573"));
        dataTransaksi.add(new Transaksi12(838632, 350929, 328316, "2021-09-18 23:00:04", "16240401 2243"));
        dataTransaksi.add(new Transaksi12(230659, 204434, 690503, "2022-02-02 19:10:34", "16270525 0112"));
        dataTransaksi.add(new Transaksi12(770592, 334245, 444267, "2020-08-11 13:36:56", "16971204 2416"));
        dataTransaksi.add(new Transaksi12(685302, 451002, 376442, "2020-05-23 07:34:53", "16100727 8862"));
        dataTransaksi.add(new Transaksi12(816129, 851403, 597842, "2021-07-18 19:41:20", "16460329 4259"));
        dataTransaksi.add(new Transaksi12(989609, 333823, 802752, "2022-02-01 01:13:11", "16320421 3437"));
        dataTransaksi.add(new Transaksi12(297103, 396116, 779589, "2021-07-03 01:09:49", "16180729 7229"));
        dataTransaksi.add(new Transaksi12(66190, 259150, 619774, "2021-09-09 03:57:30", "16950313 6823"));
        dataTransaksi.add(new Transaksi12(234301, 278309, 547922, "2021-08-24 13:18:39", "16850708 3528"));
        dataTransaksi.add(new Transaksi12(243306, 869468, 50283, "2021-03-12 03:40:16", "16080205 9329"));
        dataTransaksi.add(new Transaksi12(371045, 991242, 602034, "2021-08-06 11:48:59", "16080628 2695"));
        dataTransaksi.add(new Transaksi12(395170, 97058, 472273, "2021-05-02 10:53:3", "16130909 2979"));
        dataTransaksi.add(new Transaksi12(862731, 561908, 109431, "2021-07-31 08:11:00", "16890212 8688"));
        dataTransaksi.add(new Transaksi12(556798, 31387, 725426, "2021-03-27 06:18:20", "16141008 9963"));
        dataTransaksi.add(new Transaksi12(873982, 896213, 846142, "2021-07-18 04:06:30", "16511222 7763"));
        dataTransaksi.add(new Transaksi12(774247, 739406, 775848, "2020-10-24 01:39:00", "16720623 0943"));
        dataTransaksi.add(new Transaksi12(66987, 823014, 868772, "2020-12-21 05:57:59", "16771126 7372"));        
    }
}