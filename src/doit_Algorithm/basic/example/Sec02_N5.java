package doit_Algorithm.basic.example;

/**
 * 배열b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy 만들기
 */
public class Sec02_N5 {
    static void rcopy(int[] a, int[] b){
        int bLength = b.length;
        for (int i=0; i<bLength; i++){
            b[i] = a[i];
        }
        revers(b);
    }

    static void swap(int[] b, int idx1, int idx2){
        int temp = b[idx1];
        b[idx1] = b[idx2];
        b[idx2] = temp;
    }

    static void revers(int[] b){
        for (int i=0; i<b.length / 2; i++){
            swap(b, i, b.length -i -1);
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[5];

        rcopy(a,b);

        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"] :");
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i=0; i<b.length; i++){
            System.out.print("b["+i+"] :");
            System.out.print(b[i] + " ");
        }
    }
}
