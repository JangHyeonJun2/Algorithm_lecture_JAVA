package doit_Algorithm.정렬.퀵정렬;

import java.util.Scanner;

public class QuickSort {
    //배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //퀵 정렬
    static void quickSort(int[] a, int left, int right) {
        int pl = left; //왼쪽  커서
        int pr = right; //오른쪽 커서
        int x = a[(pl+pr) / 2]; //피벗

        do {
            while(a[pl] < x){
                pl++;
            }
            while (a[pr] > x) {
                pr--;
            }
            if (pl <= pr) {
                swap(a,pl++,pr--);
            }
        }while (pl <= pr);

        if (left < pr) quickSort(a,left,pr);
        if (right > pl) quickSort(a,pl,right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("퀵 정렬.");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        quickSort(x,0,nx-1);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i=0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
