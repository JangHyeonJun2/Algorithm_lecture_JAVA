package 백준알고리즘;

import java.util.Scanner;

public class Ex17087 {
    public static int gcd(int n1, int n2){
        if (n2 == 0)
            return n1;
        else
            return gcd(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisterN = sc.nextInt();
        int subinL = sc.nextInt();

        int[] arr = new int[sisterN];

        for (int i=0; i<sisterN; i++){
            arr[i] = Math.abs(subinL-sc.nextInt());
        }

        int firstValue = arr[0];
        for (int i=1; i<sisterN; i++){
            firstValue = gcd(firstValue,arr[i]);
        }
        System.out.println(firstValue);
    }
}
