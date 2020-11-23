import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        int[] list=new int[N+1];
        int[] ans=new int[N+1];
        Stack<Integer> s=new Stack();

        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++) {
            list[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=N;i>=1;i--) {
            if(s.isEmpty()) {
                ans[i]=-1;
                s.push(list[i]);
            }
            else {
                while(!s.isEmpty()) {
                    if(s.peek()<=list[i]) {
                        s.pop();
                    }
                    else {
                        break;
                    }
                }
                if(s.isEmpty()) {
                    ans[i]=-1;
                    s.push(list[i]);
                }
                else {
                    ans[i]=s.peek();
                    s.push(list[i]);
                }
            }
        }
        for(int i=1;i<=N;i++) {
            bw.write(ans[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
