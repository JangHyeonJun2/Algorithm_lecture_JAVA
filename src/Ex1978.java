import java.util.Scanner;

public class Ex1978 {
    public static boolean solution(int number){

        if (number < 2)
            return false;

        for (int i=2; i*i<=number; i++){
            if (number%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            int number = sc.nextInt();
            if(solution(number)){
                count++;
            }
        }
        System.out.println(count);
    }
}
