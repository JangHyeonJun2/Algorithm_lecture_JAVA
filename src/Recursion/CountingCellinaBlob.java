package Recursion;

public class CountingCellinaBlob {
    private static int BACKGROUND_COLOR = 0;
    private static int IMAGE_COLOR = 1;
    private static int ALREADY_COUNTED = 2;
    private static int N = 8;
    private static int [][] grid ={
            {0,0,0,0,0,0,0,1},
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,1,0,0,0,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0}
    };



    public static int countCells(int x, int y){
        int result;
        if (x < 0 || x >= N || y < 0 || y >= N){
            return 0;
        }else if (grid[x][y] != IMAGE_COLOR){
            return 0;
        }else {
            grid[x][y] = ALREADY_COUNTED;
            return 1 + countCells(x-1,y) + countCells(x-1,y-1) + countCells(x,y-1) + countCells(x+1,y-1)
                    + countCells(x+1,y) + countCells(x+1,y+1) + countCells(x,y+1) + countCells(x-1,y+1);
        }
    }

    public static void printMaze(){
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printMaze();
        System.out.println(grid[3][1]);
        System.out.println(countCells(3,1));
        System.out.println();
        System.out.println();
        printMaze();



    }
}
