package doit_Algorithm.정렬.퀵정렬;

import java.util.Scanner;

public class Partition {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //4 7 2 9 1 3 5 6 8
    //배열을 나눕니다.
    static void partition(int[] a, int n) {
        int pl = 0;   //왼쪽 커
        int pr = n-1; //오른쪽 커서
        int pibut = a[n/2]; //피벗(가운데 위치의 값)

        do {
            while (a[pl] < pibut) {
//                System.out.println("pl");
                pl++;
            }
            while (a[pr] > pibut) {
//                System.out.println("pr");
                pr--;
            }
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        }while (pl <= pr);

        System.out.println("피벗의 값은 " + pibut + "입니다");
        System.out.println("피벗 이하의 그룹");
        for (int i= 0; i <= pl -1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        if (pl > pr + 1) {
            System.out.println("피벗과 일치하는 그룹");
            for (int i=pr + 1; i <= pl - 1; i++ ){ //a[pr + 1] ~ a[pl - 1]
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for (int i = pr + 1; i < n; i++) { // a[pr + 1] ~ a[n - 1]
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        partition(x,nx);
    }
}
