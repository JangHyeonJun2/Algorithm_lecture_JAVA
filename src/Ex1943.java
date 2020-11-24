import java.util.Scanner;

public class Ex1943 {
    public static int lcm(int n1, int n2){
        int a = gcd(n1,n2);
        int result = a * (n1/a) * (n2/a);
        return result;
    }

    public static int gcd(int n1, int n2){
        if (n2 == 0)
            return n1;
        else
            return gcd(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            System.out.println(lcm(n1,n2));
        }

    }
}
