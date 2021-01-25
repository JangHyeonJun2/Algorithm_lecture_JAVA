package doit_Algorithm.정렬.연습문제;

import java.util.Scanner;
/**
 * 버블 정렬의 각 패스에서 비교,교환은 처음(왼쪽)부터 수행해도 됩니다. (각 패스에서 가장 큰 값의 요소가 끝으로 옮겨집니다.) 그렇게 수정한 프로그램을 작성하여라.
 */
public class Q1 {
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

        for (int i=0; i<n-1; i++) {
            for (int j=1; j<=n-1; j++) {
                if (a[j-1] > a[j])
                    swap(a,j-1,j);
            }
        }
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
    }
}
