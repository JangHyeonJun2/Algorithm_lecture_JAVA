package doit_Algorithm.정렬.연습문제;

import java.util.Scanner;

public class Q3 {

    private static int comp = 0;
    private static int exch = 0;

    static void swap(int[] a,int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    //버블 정렬
    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.println("=======================pass : "+ (i+1));
            int exchNum = 0; //패스의 교환 횟수를 기록한다.
            for (int j = 1; j <= n - 1; j++) {

                if (a[j - 1] > a[j]) {
                    exch++;
                    exchNum++;
                    print(a, j, "+");
                    swap(a, j - 1, j);
                    continue;
                }
                comp++;
                print(a,j,"-");
            }
            if (exchNum == 0) //교환이 이루어지지 않으면 종료한다.
                break;
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

        System.out.println("버블 정렬(버전1 ");
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
