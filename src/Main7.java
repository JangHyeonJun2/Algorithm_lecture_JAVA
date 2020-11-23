import java.io.*;
import java.util.Stack;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());


        while(n-->0){
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean succ = true;
            for (char ch : input.toCharArray()) {
                if (ch == '('){
                    stack.push(ch);
                }else {
                    if (stack.isEmpty()){
                        succ = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (succ && stack.isEmpty())
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb.toString());

    }
}