public class Main {

    public static void main(String[] args) {
        ScavengerHuntGame scavengerHunt = new ScavengerHuntGame();
        scavengerHunt.addPoint("Siapakah penulis buku serial Bumi?", "Tere Liye");
        scavengerHunt.addPoint("Siapakah penulis buku Kata?", "Rintik Sedu");
        scavengerHunt.addPoint("Siapakah penulis buku Luka Cita?", "Valerie Patkar");

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                           SELAMAT DATANG !                            ");
        System.out.println("=========================GAME SCAVENGER HUNT===========================");
        System.out.println("      Anda harus menjawab pertanyaan untuk mendapatkan hadiahnya !     ");
        if (scavengerHunt.playGame()) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Selamat! Anda berhasil menjawab semua pertanyaan dengan benar!");
            System.out.println("Anda mendapatkan hadiahnya!");
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Sayangnya, Anda gagal menjawab semua pertanyaan dengan benar.");
            System.out.println("Silakan coba lagi lain waktu.");
            System.out.println("---------------------------------------------------------------");
        }
    }
}