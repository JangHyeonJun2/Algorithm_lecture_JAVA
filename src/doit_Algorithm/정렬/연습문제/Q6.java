package doit_Algorithm.정렬.연습문제;

import java.util.Scanner;

/**
 * 요소의 교환 과정을 자세하게 출력할 수 있도록 단순 선택 정렬 프로그램을 수정하여라. 오르쪽처럼 정렬하지 않은 부분의 첫 번째 요소 위에는 기호 *를, 정렬하지 않은 부분의 가장 작은 값의 요소위에는 기호 +를 출력하세요.
 */
public class Q6 {
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
            print(a,i,min);
            swap(a,i,min);
        }
    }
    static void print(int[] a, int i, int min) {
        String[] str = new String[a.length];
        for (int k=0; k<str.length; k++) {
            if (k == min){
                str[k] = "+";
            }else if (k == i) {
                str[k] = "*";
            }else
                str[k] = "";
            System.out.print(str[k] + "\t");
        }
        System.out.println();
        for (int l=0; l<str.length; l++){
            System.out.print(a[l] + "\t");
        }
        System.out.println();



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문제6 ");
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
