package doit_Algorithm.재귀;

public class QueenBB {
    static boolean[] flag = new boolean[8]; //각 행에 퀸을 배치했는지 체크
    static int[] pos = new int[8]; //각 열의 퀸의 위치

    //각 열의 퀸의 위치를 출력합니다.
    static void print() {
        for (int i=0; i<8; i++) {
            System.out.printf("%2d", pos[i]);

        }
        System.out.println();
    }

    //i열의 알맞은 위치에 퀸을 배치합니다.
    static void set(int i) {//i열
        for (int j=0; j<8; j++) {//j행
            if (flag[j] == false) {
                pos[i] = j;
                if (i == 7)
                    print();
                else {
                    flag[j] = true;
                    set(i+1);
                    flag[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
