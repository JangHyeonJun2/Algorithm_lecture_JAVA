package Recursion;

public class RecursionBasicEx1 {
    public static void main(String[] args) {
        printInBinary(4);

        int[] data = {1,2,3,4};
        int result = sum(4,data);
        System.out.println(result);
    }

    public static void printInBinary(int n){//이진수 구하기
        if (n<2)
            System.out.println(n);
        else {
            printInBinary(n/2);
            System.out.println(n%2);
        }
    }

    public static int sum(int n, int[] data){//배열의 합 구하기
        if (n<=0)
            return 0;
        else
            return sum(n-1,data) + data[n-1];
    }
}
