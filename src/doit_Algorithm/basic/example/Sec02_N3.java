package doit_Algorithm.basic.example;

import java.util.Scanner;

public class Sec02_N3 {
    static int sumOf(int[] a){
        int result = 0;
        for (int i=0; i<a.length; i++){
            result+=a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수를 입력하세요");
        int num = sc.nextInt();


        int[] nums = new int[num];
        for (int i=0; i<nums.length; i++){
            System.out.print("값을 입력하세요: ");
            nums[i] = sc.nextInt();
        }

        int sum = sumOf(nums);
        System.out.println("nums의 배열 합은 : " + sum);
    }
}
