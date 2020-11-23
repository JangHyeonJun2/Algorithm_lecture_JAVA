import java.io.*;
import java.util.*;

public class Ex17298 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] a = new int[temp.length];
        int[] arr = new int[temp.length];

        for (int i=0; i<temp.length; i++){
            a[i] = Integer.parseInt(temp[i]);
        }

        //입력 예) 1 2 1 4
        for (int i=n-1; i>=0; i--){
            if (stack.isEmpty()){
                arr[i] = -1;
                stack.push(a[i]);
            }else {
                while (!stack.isEmpty()){
                    if (stack.peek() <= a[i])
                        stack.pop();
                    else
                        break;
                }
                if (stack.isEmpty()){
                    arr[i] = -1;
                    stack.push(a[i]);
                }else {
                    arr[i] = stack.peek();
                    stack.push(a[i]);
                }
            }
        }

        for (int i=0; i<n; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
