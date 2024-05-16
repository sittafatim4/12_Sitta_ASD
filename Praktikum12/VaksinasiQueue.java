import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class VaksinasiQueue {
    public static void main(String[] args) {
        DoubleLinkedListQueue queue = new DoubleLinkedListQueue();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("\n1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Pengantri Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian: ");
                    int queueNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Nama Penerima: ");
                    String name = scanner.nextLine();
                    queue.enqueue(queueNumber, name);
                    break;
                case 2:
                    queue.dequeue();
                    queue.printQueue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 4);

        scanner.close();
    }
}