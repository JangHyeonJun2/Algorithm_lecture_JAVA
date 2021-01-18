package 백준알고리즘;

import java.util.Scanner;
//3,7,5,12
public class Ex2609 {

    public static int gcm(int n1, int n2){
        if (n2 == 0)
            return n1;
        else
            return gcm(n2,n1%n2);
    }

    public static int lcm(int n1, int n2){
        int a = gcm(n1,n2);
        int result = a * (n1/a) * (n2/a);
        return result;
    }
    public static void main(String[] args) {
        //문제 : 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
        //입력 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
        //출력 : 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

        Scanner sc  = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(gcm(n1,n2));
        System.out.println(lcm(n1,n2));
    }
}
//1,1,3,1,1,1