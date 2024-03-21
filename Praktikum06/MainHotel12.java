public class MainHotel12 {
    public static void main(String[] args) {
        HotelService12 hotelService = new HotelService12(5);
        hotelService.tambah(new Hotel12("Mutiara", "Malang", 700000, (byte) 4));
        hotelService.tambah(new Hotel12("Permata", "Jakarta", 900000, (byte) 5));
        hotelService.tambah(new Hotel12("Berlian", "Solo", 500000, (byte) 4));
        hotelService.tambah(new Hotel12("Intan", "Bandung", 800000, (byte) 3));
        hotelService.tambah(new Hotel12("Diamond", "Surabaya", 400000, (byte) 2));

        System.out.println("Daftar hotel sebelum sorting:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.bubbleSortHarga();
        System.out.println("\nDaftar hotel setelah sorting dengan bubble sort berdasarkan harga:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.bubbleSortBintang();
        System.out.println("\nDaftar hotel setelah sorting dengan bubble sort berdasarkan bintang:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.selectionSortHarga();
        System.out.println("\nDaftar hotel setelah sorting dengan selection sort berdasarkan harga:");
        System.out.println();
        hotelService.tampilAll();

        hotelService.selectionSortBintang();
        System.out.println("\nDaftar hotel setelah sorting dengan selection sort berdasarkan bintang:");
        System.out.println();
        hotelService.tampilAll();
    }
}
