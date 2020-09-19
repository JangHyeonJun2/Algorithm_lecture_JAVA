package doit_Algorithm.basic.example;

public class N1 {
    public static int max4(int a, int b, int c, int d){
        int max = a;
        if (b > max)
            max = b;
        else if (c > max)
            max = c;
        else if (d > max)
            max = d;

        return max;
    }
    public static void main(String[] args) {
        System.out.println(max4(2,1,10,9));
    }
}
