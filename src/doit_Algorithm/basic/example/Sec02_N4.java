package doit_Algorithm.basic.example;

public class Sec02_N4 {
    static void copy(int[] a, int[] b){ //전제 조건이 a의 길이가 b의 길이 보다 크다는 조건이 있어야 한다.
        int bLength = b.length;
        for (int i=0; i<bLength; i++){
            b[i] = a[i];
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[5];

        copy(a,b);

        for (int i=0; i<a.length; i++){
            System.out.print("a = ");
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i=0; i<b.length; i++){
            System.out.print("b = ");
            System.out.print(b[i] + " ");
        }
    }
}
