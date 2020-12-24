import java.util.Scanner;

public class Ex2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] arr = new long[num];

        if (num == 1) {
            arr[0] = 1;
        }else if(num == 2) {
            arr[1] = 1;
        }else if (num > 2){
            arr[0] = 1;
            arr[1] = 1;
            for (int i=2; i<num; i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
        }

        System.out.println(arr[num-1]);
    }
}
