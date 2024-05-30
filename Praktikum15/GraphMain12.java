import java.util.Scanner;

public class GraphMain12 {
    // public static void main(String[] args) throws Exception {
    //     Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Graph12 gedung = new Graph12(6);
    
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        
        System.out.println("Graf sebelum perubahan jarak:");
        gedung.printGraph();
        
        // Mengubah jarak antara node 0 dan 1 menjadi 80
        gedung.updateJarak(0, 1, 80);
        gedung.updateJarak(0, 2, 30);
        gedung.updateJarak(1, 3, 50);
        gedung.updateJarak(2, 3, 20);
        gedung.updateJarak(3, 4, 50);
        gedung.updateJarak(4, 5, 20);
        
        System.out.println("Graf setelah perubahan jarak:");
        gedung.printGraph();

        System.out.println("Jumlah edge dalam graf: " + gedung.hitungEdge());
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();
    
        // Scanner scanner = new Scanner(System.in);
    
        // System.out.print("Masukkan gedung asal: ");
        // int node1 = scanner.nextInt();
        // System.out.print("Masukkan gedung tujuan: ");
        // int node2 = scanner.nextInt();
    
        // if (gedung.isAdjacent(node1, node2)) {
        //     System.out.println("\u001B[32mGedung " + (char) ('A' + node1) + " dan Gedung " + (char) ('A' + node2) + " bertetangga");
    
        // } else {
        //     System.out.println("\u001B[31mGedung " + (char) ('A' + node1) + " dan Gedung " + (char) ('A' + node2) + " tidak bertetangga");
    
        // }
    
        // scanner.close();
    }

    }

    //     GraphMatriks12 gdg = new GraphMatriks12(6);
    //     gdg.makeEdge(0, 1, 50);
    //     gdg.makeEdge(0, 2, 100);
    //     gdg.makeEdge(1, 3, 70);
    //     gdg.makeEdge(2, 3, 40);
    //     gdg.makeEdge(3, 4, 60);
    //     gdg.makeEdge(4, 5, 80);

    //     boolean exit = false;

    //     while (!exit) {
    //         System.out.println("\nMenu Program:");
    //         System.out.println("a) Add Edge");
    //         System.out.println("b) Remove Edge");
    //         System.out.println("c) Degree");
    //         System.out.println("d) Print Graph");
    //         System.out.println("e) Cek Edge");
    //         System.out.println("f) Update Jarak");
    //         System.out.println("x) Keluar");

    //         System.out.print("Pilih menu (a/b/c/d/e/f/x): ");
    //         String choice = scanner.nextLine();

    //         switch (choice) {
    //             case "a":
    //                 System.out.print("Masukkan gedung asal: ");
    //                 int asal = Integer.parseInt(scanner.nextLine());
    //                 System.out.print("Masukkan gedung tujuan: ");
    //                 int tujuan = Integer.parseInt(scanner.nextLine());
    //                 System.out.print("Masukkan jarak: ");
    //                 int jarak = Integer.parseInt(scanner.nextLine());
    //                 gdg.makeEdge(asal, tujuan, jarak);
    //                 System.out.println("Edge berhasil ditambahkan.");
    //                 break;
    //             case "b":
    //                 System.out.print("Masukkan gedung asal: ");
    //                 int rmAsal = Integer.parseInt(scanner.nextLine());
    //                 System.out.print("Masukkan gedung tujuan: ");
    //                 int rmTujuan = Integer.parseInt(scanner.nextLine());
    //                 gdg.removeEdge(rmAsal, rmTujuan);
    //                 System.out.println("Edge berhasil dihapus.");
    //                 break;
    //             case "c":
    //                 System.out.print("Masukkan gedung yang ingin dicek degreenya: ");
    //                 int degreeGedung = Integer.parseInt(scanner.nextLine());
    //                 gdg.degree(degreeGedung);
    //                 break;
    //             case "d":
    //                 System.out.println("Graf saat ini:");
    //                 gdg.printGraph();
    //                 break;
    //             case "e":
    //                 System.out.print("Masukkan gedung asal: ");
    //                 int startNode = Integer.parseInt(scanner.nextLine());
    //                 System.out.print("Masukkan gedung tujuan: ");
    //                 int endNode = Integer.parseInt(scanner.nextLine());
    //                 char startGedung = (char) ('A' + startNode);
    //                 char endGedung = (char) ('A' + endNode);
    //                 if (gdg.matriks[startNode][endNode] != -1) {
    //                     System.out.println("Gedung " + startGedung + " dan gedung " + endGedung + " terhubung dengan jarak " + gdg.matriks[startNode][endNode] + " m.");
    //                 } else {
    //                     System.out.println("Gedung " + startGedung + " dan gedung " + endGedung + " tidak terhubung.");
    //                 }
    //                 break;
    //             case "f":
    //                 System.out.print("Masukkan gedung asal: ");
    //                 int src = Integer.parseInt(scanner.nextLine());
    //                 System.out.print("Masukkan gedung tujuan: ");
    //                 int dest = Integer.parseInt(scanner.nextLine());
    //                 System.out.print("Masukkan jarak baru: ");
    //                 int newDistance = Integer.parseInt(scanner.nextLine());
    //                 gedung.updateJarak(src, dest, newDistance);
    //                 break;
    //             case "x":
    //                 exit = true;
    //                 System.out.println("Program selesai.");
    //                 break;
    //             default:
    //                 System.out.println("Input tidak valid. Silakan masukkan pilihan yang sesuai.");
    //                 break;
    //         }
    //     }

    //     scanner.close();
    // }

