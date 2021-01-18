package doit_Algorithm.재귀.연습문제;

import java.util.Scanner;

/**
 * 재귀 메서드 호출을 사용하지 않고 EuclidGCD.java의 gcd 메서드를 작성하여라.
 */

public class Q2 {
    static public int gcd(int x, int y) {
        int tmp = 0;
        if (y == 0)
            return x;
        else {
            do {
                tmp  = x;
                x = y;
                y = tmp % y;

            }while(y != 0);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        System.out.print("정수를 입력하섿요 : ");
        int y = stdIn.nextInt();

        System.out.println("최대공약수는 " + gcd(x,y)+ "입니다.");
    }
}
