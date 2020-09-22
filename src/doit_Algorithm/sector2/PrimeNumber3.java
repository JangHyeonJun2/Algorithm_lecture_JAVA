package doit_Algorithm.sector2;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int n=5; n<=1000; n+=2) {// 대상은 홀수만
            boolean flag = false;
            for (int i=1; prime[i] * prime[i] <= n; i++){
                /**
                 * 여기서 counter를 2씩 증가시키는 것은 곱셈(prime[i] * prime[i])과 나눗셈(n % prime[i])을 카운트 하기 위해서 이다.
                 */
                counter+=2;
                if (n % prime[i] == 0){
                    flag = true;
                    break;
                }
            }//두번재 for문
            if (!flag){
                prime[ptr++] = n;
                /**
                 * 여기서 counter를 해주는 이유는 만약에 두 번째 for문에서 prime[i] * prime[i] <= n 이것이
                 * 성립하지 않을 때 흐름이 안쪽 for문의 루프 본문으로 들어가지 않으므로 그 곱셈이 수행횟에 포함 x
                 */
                counter++;
            }// if
        }// 첫번째 for문

        for (int i=0; i<ptr; i++){
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
