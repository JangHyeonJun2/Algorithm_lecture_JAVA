package doit_Algorithm.sector2;

import java.util.Scanner;

public class MaxOfArray {

    static int MaxOf(int[] a) {
        int max = a[0];

        for (int i=1; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int peopleNum = sc.nextInt(); // 사람수 입력하기

        int[] height = new int[peopleNum];
        for (int i=0; i<height.length; i++){
            System.out.print("height[" + i + "] : ");
            height[i] = sc.nextInt();
        }

        System.out.println("height의 최댓값은 : " + MaxOf(height));
    }
}
