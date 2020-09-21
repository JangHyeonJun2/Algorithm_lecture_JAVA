package doit_Algorithm.sector2;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    static int maxOf(int[] a){
        int max = a[0];

        for (int i=1; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int peopleNum = sc.nextInt(); // 사람수 입력하기

        int[] height = new int[peopleNum];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i=0; i<height.length; i++){
            height[i] = 100 + rand.nextInt(90); // 여기서 nextInt(n)가 반환하는 것은 0부터 n -1까지의 난수입니다. 이 경우 0부터 89까지의 난수가 생성됩니다.
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height));
    }
}
