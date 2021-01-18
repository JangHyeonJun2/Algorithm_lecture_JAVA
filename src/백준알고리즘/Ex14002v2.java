package 백준알고리즘;

import java.util.Scanner;

public class Ex14002v2 {
    static int[] a;
    static int[] b;
    static int[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        b = new int[n];
        c = new int[n];

        for (int i=0; i<n; i++) {
            b[i] = 1;
            c[i] = -1;
            for (int j=0; j<i; j++) {
                if (a[j] < a[i] && b[i] < b[j]+1) {
                    b[i] = b[j]+1;
                    c[i] = j;
                }
            }
        }

        int num = b[0];
        int p = 0;
        for (int i=0; i<n; i++) {
            if (num < b[i]){
                num = b[i];
                p = i;
            }
        }
        System.out.println(num);
        go(p);
        System.out.println();

    }

    private static void go(int p) {
        if (p == -1)
            return;
        go(c[p]);
        System.out.print(a[p]+ " ");
    }
}
