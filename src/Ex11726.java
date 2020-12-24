import java.util.Scanner;

public class Ex11726 {
    static int[] d;
    public static int go(int n){
        if(d[n] > 0)
            return d[n];
        else{
            d[n] = (go(n-1) + go(n-2));
            return d[n];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n+1];

        d[0] = 1;
        d[1] = 1;

        System.out.println(go(n));
    }
}
