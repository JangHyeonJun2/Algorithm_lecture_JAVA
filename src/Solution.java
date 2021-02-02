import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public boolean solution(int x) {
        int tmp = 0;
        String[] split = Integer.toString(x).split("");
        for (String str : split) {
            tmp+=Integer.parseInt(str);
        }
        if (x % tmp == 0)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        int arr = sc.nextInt();
        boolean answer = s.solution(arr);
        System.out.println(answer);
    }
}
