package 백준알고리즘;

import java.util.Scanner;

public class Ex1929 {
    public static boolean solution(int n){
        if (n < 2)
            return false;

        for (int i=2; i*i<=n; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i=n; i<m; i++){
                if (solution(i))
                    System.out.println(i);
        }
    }
}
