package doit_Algorithm.basic;

public class Max3m {
    static int max3(int a, int b, int c){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }
    public static void main(String[] args) {
        int result = max3(4,1,5);
        System.out.println(result);
    }
}
