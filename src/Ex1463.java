import java.util.Scanner;

public class Ex1463 {
    static int[] d;

    //1로 만들기 예시 코드(재귀적 코드)
    public static int go(int n){

        if (n ==1)
            return 0;
//        if (d[n] > 0)
//            return d[n];
        //n에 1을 빼는 경우
        d[n] = go(n-1) + 1;
        //n이 2로 나누어 떨어지는 경우
        if (n%2 == 0){
            int temp = go(n/2) + 1;
            if (d[n] > temp)
                d[n] = temp;
        }
        //n이 3으로 나우어 떨어지는 경우
        if (n%3 == 0){
            int temp = go(n/3) + 1;
            if (d[n] > temp)
                d[n] = temp;
        }

        return d[n];
    }

    public static int go2(int n){
        d[1] = 0;
        for (int i=2; i<=n; i++){
            d[i] = d[i-1] + 1;
            if (i%2 == 0 && d[i] > d[i/2] + 1)
                d[i] = d[i/2] + 1;
            if (i%3 == 0 && d[i] > d[i/3] + 1)
                d[i] = d[i/3] + 1;
        }
        return d[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n + 1];
        System.out.println(go(n));
    }
}
