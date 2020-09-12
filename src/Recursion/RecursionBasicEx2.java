package Recursion;

public class RecursionBasicEx2 {
    public static void main(String[] args) {
        int[] items = {1,2,3,4,5,7,9,100};
        int result = search(items, items[0], items.length-1, 4);
        System.out.println(result);

        int maxValue = findMax(items,items[0]-1,items.length-1);
        System.out.println(maxValue);


        int idx_value = binarySearch(items,9,0,items.length-1);
        System.out.println(idx_value);
    }

    public static int search(int[] data, int begin, int end, int target){//Recursion ver. 순차탐색
        if (begin > end)
            return -1;
        else if (target == data[begin])
            return begin;
        else
            return search(data, begin+1, end, target);
    }

    public static int findMax(int[] data,int begin, int end){//Recursion ver. 최대값 구하기
        if (begin == end)
            return data[begin];
        else
            return Math.max(data[begin],findMax(data,begin+1,end));
    }

    public static int binarySearch(int[] data, int target, int begin, int end){//Binary Search
        if (begin>end)
            return -1;
        else {
            int middle = (begin+end)/2;
            if (target == data[middle])
                return middle;
            else if (target > data[middle])
                return binarySearch(data, target, middle+1, end);
            else if (target < data[middle])
                return binarySearch(data, target, begin, middle-1);
            }
        return 0;
        }
    }
