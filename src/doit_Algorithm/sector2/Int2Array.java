package doit_Algorithm.sector2;

public class Int2Array {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {5,6,7},
        };

        int[][] b = a.clone();

        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.println(b[i][j]);
            }
        }
    }
}
