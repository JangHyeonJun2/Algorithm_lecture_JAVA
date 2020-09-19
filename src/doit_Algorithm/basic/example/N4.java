package doit_Algorithm.basic.example;


public class N4 {
    /**
     *
     * 중앙값 구하기
     */
    static int med4(int a, int b, int c){
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }
    public static void main(String[] args) {
        int result = med4(2,3,1);
        System.out.println(result);
    }
}
