package doit_Algorithm.정렬;

import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] a,int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    //버블 정렬
    static void bubbleSort(int[] a, int n) {
        for (int i = 0;i<n-1; i++) {
            int exchNum = 0; //패스의 교환 횟수를 기록한다.
            for (int j=n-1; j>i; j--) {
                if (a[j-1] > a[j]) {
                    swap(a, j - 1, j);
                    exchNum++;
                }
            }
            if (exchNum == 0) //교환이 이루어지지 않으면 종료한다.
                break;
        }
    }

    static void bubbleSort2(int[] a, int n) {
        int k=0;
        while (k < n - 1) {
            int last = n - 1;
            for (int j=n-1; j>k; j--) {
                if (a[j - 1] > a[j]){
                    swap(a, j-1 , j);
                    last = j;
                }

            }
            k = last;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전3) ");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i=0; i< nx; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        bubbleSort2(x,nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i=0; i<nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
