import java.io.*;
import java.util.*;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트 케이스 갯수
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        Stack<String> stack = new Stack<>();

        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            while (st.hasMoreTokens()){
                String[] str = st.nextToken().split("");
                for (String a : str) {
                    stack.push(a);
                }
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
