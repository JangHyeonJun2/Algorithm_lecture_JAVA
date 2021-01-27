package doit_Algorithm.정렬.단순선택정렬;

import java.util.Scanner;

public class SelectionSort {
    static void swap(int[] a,int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    static void selectionSort(int[] a, int n) {
        for (int i=0; i<n-1; i++) {
            int min = i; //아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 기록합니다.
            for (int j=i+1; j<n; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            swap(a,i,min);
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

        selectionSort(x,nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i=0; i<nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
