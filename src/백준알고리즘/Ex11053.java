package 백준알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int d[] = new int[n];
        int arr2[];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        d[0] = 1;

        for (int i=1; i<n; i++) {
            d[i] = 1;
            for (int j=0; j<i; j++) {
                if (arr[j] < arr[i] && d[i] <= d[j]) {
                    d[i] = d[j] + 1;
                    System.out.println(arr[i]);
                }
            }
        }

        int max = 0;
        for (int i : d) {
            max = Math.max(max,i);
        }

        System.out.println(max);
    }
}












































//    Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i=0; i<N; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int minValue = findMinValue(arr);
//        int resultValue = compareArr(minValue, arr);
//        System.out.println(resultValue);
//    }
//
//    private static int compareArr(int minValue, int[] arr) {
//        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add(minValue);
//
//        for (int i=0; i<arr.length; i++) {
//            int tmpValue = arr[i];
//            boolean flag = false;
//            for (int j=0; j<arrayList.size(); j++){
//                if (arrayList.get(j) != tmpValue && arrayList.get(j) < tmpValue) {
//                    flag = true;
//                }
//                else
//                    flag = false;
//            }
//            if (flag == true)
//                arrayList.add(tmpValue);
//        }
//        return arrayList.size();
//    }
//
//    private static int findMinValue(int[] arr) {
//        int min = arr[0];
//
//        for (int i=1; i<arr.length; i++) {
//            min = Math.min(min, arr[i]);
//        }
//        return min;