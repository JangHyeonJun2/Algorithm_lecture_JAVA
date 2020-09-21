package doit_Algorithm.basic.example;

import java.util.Scanner;

public class Sec02_N2 {
    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    static void revers(int[] a){
        for (int i=0; i<a.length / 2; i++){
            int endNum = a.length -i -1;
            System.out.println("a["+i+"]과"+"a["+endNum+"]를 교환합니다.");
            swap(a, i, a.length -i -1);
        }
        System.out.println("역순 정리를 마쳤습니다.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] nums = new int[num];

        for (int i=0; i<nums.length; i++){
            System.out.print("nums[" + i +"] : ");
            nums[i] = sc.nextInt();
        }
        revers(nums);

//        System.out.println("요소를 역으로 정리했습니다.");
//        for (int i=0; i<nums.length; i++){
//            System.out.println("nums[" + i + "] = " +nums[i]);
//        }
    }
}
