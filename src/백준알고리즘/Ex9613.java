package 백준알고리즘;

import java.io.IOException;
import java.util.Scanner;

public class Ex9613 {
    public static int gcd(int n1, int n2){
        if (n2 == 0)
            return n1;
        else
            return gcd(n2,n1%n2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            long sum = 0;
            int a = sc.nextInt();
            int[] t = new int[a];
            for (int k=0; k<a; k++){
                t[k] = sc.nextInt();
            }

            for (int i=0; i<a-1; i++){
                for (int j=i+1; j<a; j++){
                    sum+=gcd(t[i], t[j]);
                }
            }
            System.out.println(sum);
        }

    }
}
