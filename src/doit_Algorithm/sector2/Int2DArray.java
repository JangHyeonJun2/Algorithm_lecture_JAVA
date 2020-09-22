package doit_Algorithm.sector2;

public class Int2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];

        arr[0][1] = 37;
        arr[0][3] = 54;
        arr[1][2] = 65;

        for (int i=0; i<2; i++){
            for (int j=0; j<arr[i].length; j++)
                System.out.println("arr[" +i+ "][" + j + "] = " + arr[i][j]);
        }
    }
}
