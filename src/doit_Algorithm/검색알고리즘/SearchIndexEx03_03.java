package doit_Algorithm.검색알고리즘;

import java.util.Scanner;

public class SearchIndexEx03_03 {
    static int searchIndex(int[] a, int n, int key, int[] idx){
        int j=0;

        for (int i=0; i<a.length; i++){
            if (a[i] == key){
                idx[j++] = i;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for (int i=0; i<num; i++){
            System.out.print("x[" + i + "]:");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int result = searchIndex(x, num, ky, y);

        if (result == 0)
            System.out.println("그 값의 요소가 없습니다.");
        else{
            for (int i=0; i<result; i++){
                System.out.println("그 값은 " + "x[" +y[i]+ "]에 있습니다.");
            }
        }

    }
}
