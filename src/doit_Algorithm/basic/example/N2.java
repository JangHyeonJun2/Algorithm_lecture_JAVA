package doit_Algorithm.basic.example;

public class N2 {
    static int min3(int a, int b, int c){
        int min = a;
        if (b < min)
            min = b;
        else if (c < min)
            min = c;
        return min;
    }
    public static void main(String[] args) {
        System.out.println(min3(-1,4,-3));
    }
}
