import java.io.*;
import java.util.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        //명령어 숫자 입력하기
        int orderNum = Integer.parseInt(br.readLine());
        for (int i=0; i<orderNum; i++){
//            String input = sc.next();
            String str = br.readLine();
            if (str.equals("push")){
                int num = Integer.parseInt(br.readLine());
                stack.push(num);
            }else if (str.equals("pop")){
                System.out.println(stack.isEmpty()?-1:stack.pop());
            }else if (str.equals("size")){
                System.out.println(stack.size());
            }else if (str.equals("empty")){
                System.out.println(stack.isEmpty()?1:0);
            }else if (str.equals("top")){
                System.out.println(stack.isEmpty()?-1:stack.peek());
            }
        }
    }
}
