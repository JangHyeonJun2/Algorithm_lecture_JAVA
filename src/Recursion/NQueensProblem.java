package Recursion;

public class NQueensProblem {
    static final int N = 4;
    int[] cols = new int [N];


    /**
     * cols[i]=j는 i번 말이 (i행,j열)에 놓였음을 의미한다.
     */
    public void queens(int level){
        if (level == N){
            for (int i=0; i<N; i++){
//                System.out.print("(" + i + ", " + cols[i] + ")");
                System.out.print(cols[i]);
            }
            System.out.println();
        }else {
            for (int i=0; i<N; i++){
                cols[level] = i;
                if (promising(level))
                    queens(level+1);
            }
        }
    }

    boolean promising(int level){
        for (int i=0; i<level; i++){
            if (cols[i] == cols[level]) //같은 열에 놓였는지 검사
                return false;
            else if (level-i == Math.abs(cols[level]-cols[i])) //같은 대각선에 놓였는지 검사
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        NQueensProblem nqp = new NQueensProblem();
        nqp.queens(0);

    }
}
