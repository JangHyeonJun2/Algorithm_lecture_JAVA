package doit_Algorithm.큐;

import java.util.Scanner;

public class LastNElements {
    //원하는 개수만큼 값을 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];//입력 받은 값으 저장
        int cnt = 0;        //입력 받은 개수
        int retry;          //다시 한번?

        System.out.println("정수를 입력하세요 .");


        do{
            System.out.printf("%d번쨰 정수 : ",cnt +1);
            a[cnt++ % N] = sc.nextInt(); //첫 번째 포인트

            System.out.print("계속 할까요? (예.1/ 아니오.0) :");
            retry = sc.nextInt();
        }while (retry == 1);

        /**
         * 두 번째 포인트
         */
        int i = cnt - N;
        if (i < 0)
            i = 0;

        for ( ; i < cnt; i++) {
            System.out.printf("%2d번째의 정수 = %d\n", (i%N) + 1,a[i % N]);
        }
    }
}
