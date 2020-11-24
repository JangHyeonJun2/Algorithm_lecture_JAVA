import java.util.Scanner;

public class Ex10430 {
    public static int solution1(int a, int b, int c){
        int result = (a+b)%c;
        return result;
    }

    public static int solution2(int a, int b, int c){
        int result = ((a%c) + (b%c))%c;
        return result;
    }

    public static int solution3(int a, int b, int c){
        int result = (a*b)%c;
        return result;
    }

    public static int solution4(int a, int b, int c){
        int result = ((a%c) * (b%c))%c;
        return result;
    }

    public static void main(String[] args) {
        //입력
        //첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

        //출력
        //첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

        //n1, n2, n3는 2보다 커야한다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(solution1(a,b,c));
        System.out.println(solution2(a,b,c));
        System.out.println(solution3(a,b,c));
        System.out.println(solution4(a,b,c));


    }
}
