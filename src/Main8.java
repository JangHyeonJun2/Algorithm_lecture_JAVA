import java.io.*;
import java.util.Stack;

public class Main8 {
    public static void print(BufferedWriter bw, Stack<Character> stack) throws IOException{
        while (!stack.isEmpty()){
            bw.write(stack.pop());
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine()+"\n";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        boolean tag = false;

        for (char ch : str.toCharArray()) {
            if (ch == '<'){
                tag = true;
                print(bw,stack);
                bw.write(ch);
            }else if (ch == '>'){
                tag = false;
                bw.write(ch);
            }else if (tag){
                bw.write(ch);
            }else {
                if(ch == ' ' || ch == '\n') {
                    while(!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch); // 공백
                } else
                    stack.push(ch);
            }
        }
//        print(bw, stack);
//        bw.write("\n");
        bw.flush();
    }
}
