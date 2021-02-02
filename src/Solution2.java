import java.util.Scanner;

public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        int oneNumber = count(str);
        for (int i = n+1; ;i++) {
            String s = Integer.toBinaryString(i);
            int countNumber = count(s);
            if (oneNumber == countNumber)
                return i;
        }
    }

    private int count(String str) {
        int n = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == '1')
                n++;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution2 s2 = new Solution2();

        int num = sc.nextInt();
        System.out.println(s2.solution(num));
    }
}
