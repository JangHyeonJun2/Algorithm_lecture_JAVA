package doit_Algorithm.재귀;

import java.util.Scanner;

/**
 * 두 정수가 주어질 경우 큰 값을 작은 값으로 나우었을 때 나누어 떨어지는 가장 작은 값이 최대공약수이다. 나누어지지 않으면 작은 값에 대해 나누어 떨어질때까지 같은 과정을 재귀적으로 반복합니다.
 */
public class EuclidGCD {
    // 정수 x,y의 최대공약수를 구하여 반환합니다.
    static  int gcd(int x, int y) {
        if (y==0)
            return x;
        else
            return gcd(y, x%y);
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
