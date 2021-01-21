package doit_Algorithm.하노이.연습문제;


import java.util.Scanner;

/**
 * recur5메서드를 비재귀적으로 구현하시오.
 */
public class Q5 {

    static void recur4(int n) {
        int[] nstk = new int[100];
        int[] sstk = new int[100];
        int ptr = -1;
        int sw = 0;

        while (true) {
            if (n > 0) {
                ptr++;
                nstk[ptr] = n;
                sstk[ptr] = sw;

                if (sw == 0)
                    n = n - 1;
                else if (sw == 1) {
                    n = n - 2;
                    sw = 0;
                }
                continue;
            }
            do {
                n = nstk[ptr];
                sw = sstk[ptr--] + 1;

                if (sw == 2) {
                    System.out.println(n);
                    if (ptr < 0)
                        return;
                }
            } while (sw == 2);
        }
    }

    static void recur5(int n) {
        if (n > 0) {
            recur5(n - 1);
            recur5(n - 2);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.：");
        int x = stdIn.nextInt();

        recur4(x);
    }
}
