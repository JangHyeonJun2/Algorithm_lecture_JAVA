package doit_Algorithm.하노이;

import java.util.Scanner;


/**
 * 1. 바닥 원반을 제외한 그룹(원반[1] - 원반[no - 1]을 시작 기둥에서 중간 기둥으로 옮긴다.
 * 2. 바닥 원반 no를 시작 기둥에서 목표기둥으로 옮겼음을 출력합니다.
 * 3. 바닥 원반을 제외한 그룹(원반[1] - 원반[no - 1]을 중간 기둥에서 목표 기둥으로 옮깁니다.
 *  이 프로그램은 기둥번호를 정수 1, 2, 3으로 나타낸다. 기둥 번호의 합이 6이므로 시작기둥, 목표기둥이 어느 기둥이더라도 중간기둥은 6 -x - y로 구할 수 있습니다.**중요**
 */
public class Hanoi {
    static void move(int no, int from, int to) {
        if (no > 1){
            move(no -1,from, 6 - from -to);
        }
        System.out.println("원반[" + no + "]을" + from + "기둥에서 " + to + "기둥으로 옮김");
        if (no > 1)
            move(no - 1, 6 - from - to, to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int n = sc.nextInt();

        move(n,1,3); //1번 기둥의 n개의 원반을 3번 기둥으로 옮

    }
}
