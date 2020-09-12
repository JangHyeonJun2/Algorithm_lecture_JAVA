package Recursion.mazeProject;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Maze {
    private static int N = 8;
    private static int [][] maze ={
            {0,0,0,0,0,0,0,1},
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,1,0,0,0,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0}
    };


    private static final int PATHWAY_COLOR = 0; //white
    private static final int WALL_COLOR = 1; //blue
    private static final int BLOCKED_COLOR = 2; //red 방문은 했지만 길이 없다.
    private static final int PATH_COLOR = 3; //green 내가 방문한 길


    public static boolean findMazePath(int x, int y){
        if (x < 0 || y < 0 || x >= N || y >= N)
            return false;
        else if (maze[x][y] != PATHWAY_COLOR)
            return false;
        else if (x == N-1 && y == N-1){
            maze[x][y] = PATH_COLOR;
            return true;
        }else{
            maze[x][y] = PATH_COLOR;
            if (findMazePath(x-1,y) || findMazePath(x+1,y) || findMazePath(x,y-1) || findMazePath(x,y+1)){
                return true;
            }
            maze[x][y] = BLOCKED_COLOR;//dead end
            return false;
        }
    }

    public static void printMaze(){
        for (int i=0;i<maze.length;i++){
            for (int j=0;j<maze[i].length;j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
    public static void makeBtn(){
        Button[][] buttons = new Button[8][8];

        JFrame frame = new JFrame();


        for (int i=0;i<maze.length;i++){
            for (int j=0;j<maze[i].length;j++){
                if (maze[i][j] == PATHWAY_COLOR){
                    buttons[i][j] = new Button(""+maze[i][j]);
                    buttons[i][j].setBackground(Color.gray);
                }else if (maze[i][j] == WALL_COLOR){
                    buttons[i][j] = new Button(""+maze[i][j]);
                    buttons[i][j].setBackground(Color.BLACK);
                }else if (maze[i][j] == BLOCKED_COLOR){
                    buttons[i][j] = new Button(""+maze[i][j]);
                    buttons[i][j].setBackground(Color.red);
                }else if (maze[i][j] == PATH_COLOR){
                    buttons[i][j] = new Button(""+maze[i][j]);
                    buttons[i][j].setBackground(Color.green);
                }
                buttons[i][j].setVisible(true);
                frame.add(buttons[i][j]);
            }//for(j)
        }//for(i)


//        frame.setPreferredSize(new Dimension(840,840/12*9));
        frame.setSize(1280,840);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public static void main(String[] args) {
        makeBtn();
//        System.out.println("길찾기 프로그램 실행전");
//        System.out.println("--------------");
//        printMaze();
//        findMazePath(0,0);
//        System.out.println();
//        System.out.println("길찾기 프로그램 실행후");
//        System.out.println("--------------");
        //printMaze();
    }
}
