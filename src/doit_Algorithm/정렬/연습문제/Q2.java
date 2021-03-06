package doit_Algorithm.정렬.연습문제;

import java.util.Scanner;

/**
 *
 */
public class Q2 {
    private static int comp = 0;
    private static int exch = 0;

    static void swap(int[] a,int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    //버블 정렬
    static void bubbleSort(int[] a, int n) {
//        for (int i = 0;i<n-1; i++) {
//            for (int j=n-1; j>i; j--) {
//                if (a[j-1] > a[j])
//                    swap(a,j-1,j);
//            }
//        }

        for (int i = 0; i < n - 1; i++) {
            System.out.println("=======================pass : "+ (i+1));
            for (int j = 1; j <= n - 1; j++) {

                if (a[j - 1] > a[j]) {
                    exch++;
                    print(a, j, "+");
                    swap(a, j - 1, j);
                    continue;
                }
                comp++;
                print(a,j,"-");
            }

        }
    }
    static void print(int[] a, int location, String str) {

        for (int i=0; i<a.length;i++) {
            if (i == location)
                System.out.print(str);
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(연습문제1) ");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i=0; i< nx; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x,nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i=0; i<nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        System.out.println("교환 : "+exch);
        System.out.println("비교 : "+comp);
    }
}
