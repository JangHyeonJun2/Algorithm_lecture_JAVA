package doit_Algorithm.재귀.함수;

import doit_Algorithm.스택.IntStack;

import java.util.Scanner;

public class Recur {

    //재귀함수
    static void recur(int n) {
        if (n > 0) {
            recur(n -1);
            System.out.println(n);
            recur(n-2);
        }
    }

    //꼬리 재귀를 제거한 모습
    static void recur2(int n) {
        while(n > 0) {
            recur2(n-1);
            System.out.println(n);
            n = n - 2;
        }
    }
    static void recur3(int n) {
        IntStack s = new IntStack(n);

        while(true) {
            if (n > 0) {
                s.push(n);
                n = n -1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;

            }
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int x = stdIn.nextInt();

        recur3(x);
    }


}
