package 백준알고리즘;

import java.util.Scanner;

public class Ex11052 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int cardN = sc.nextInt();
        int[] cardPrice = new int[cardN+1];
        int[] arr = new int[cardN+1];

        for (int i = 1; i<=cardN; i++){
            cardPrice[i] = sc.nextInt();
        }

        for (int i=1; i<=cardN; i++){
            for (int j=1; j<=i; j++){
                arr[i] = Math.max(arr[i],arr[i-j] + cardPrice[j]);
            }
        }
        System.out.println(arr[cardN]);

    }
}
