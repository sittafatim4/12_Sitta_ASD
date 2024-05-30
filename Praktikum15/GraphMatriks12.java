public class GraphMatriks12 {
    int vertex;
    int[][] matriks;

    public GraphMatriks12(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int inDegree(int v) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][v] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int outDegree(int v) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[v][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public void degree(int v) {
        int inDegree = inDegree(v);
        int outDegree = outDegree(v);
        System.out.println("InDegree dari Gedung " + (char) ('A' + v) + ": " + inDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + v) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + v) + ": " + (inDegree + outDegree));
        System.out.println();
    }
    
}
