package doit_Algorithm.재귀.연습문제;

import java.util.Scanner;

/**
 * 재귀 메서드 호출을 사용하지 않고 Factorial.java의 factorial 메서드를 작성하세요.
 */
public class Q1 {
    static public int factorial(int x) {
        int tmp = x;
        while (x-1 > 0){
            tmp *= x-1;
            x--;
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " +factorial(x) + "입니다.");
    }
}
