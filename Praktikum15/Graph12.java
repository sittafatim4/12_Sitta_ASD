public class Graph12 {
    int vertex;
    DoubleLinkedLists12 list[];

    public Graph12(int v) {
        vertex = v;
        list = new DoubleLinkedLists12[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists12();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) {
        try {
            int totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                // inDegree
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == asal) {
                        ++totalIn;
                    }
                }
                // outDegree
                totalOut = list[asal].size();
            }
            System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
            System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
            System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
    

    public void removeEdge (int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    

    public boolean isAdjacent(int node1, int node2) {
        try {
            for (int i = 0; i < list[node1].size(); i++) {
                if (list[node1].get(i) == node2) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }     

    
    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    try {
                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                    } catch (Exception e) {
                        System.err.println("Error retrieving edge information: " + e.getMessage());
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) {
        list[asal].updateJarak(tujuan, jarakBaru);
    }

    public int hitungEdge() {
        int totalEdge = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdge += list[i].size();
        }
        return totalEdge;
    }

    
}
