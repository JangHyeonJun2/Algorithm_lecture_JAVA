import java.util.*;
import java.math.*;
public class Ex2193v2 {

    static long dp[][] ; // 데이터 타입에 유의한다.

    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        dp = new long [n+1][2];

        //N이 1일 경우는 초기화해둔다.
        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i=2;i<=n;i++) {
            for(int j=0;j<2;j++) {
                if(j==0) {
                    dp[i][j] = dp[i-1][0] + dp[i-1][1];
                }else {
                    dp[i][j] = dp[i-1][0];
                }
            }
        }

        long sum =0;
        for(int i=0;i<2;i++) {
            sum+=dp[n][i];

        }

        System.out.println(sum);





    }

}