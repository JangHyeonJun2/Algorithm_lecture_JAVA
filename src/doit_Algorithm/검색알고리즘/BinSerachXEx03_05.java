package doit_Algorithm.검색알고리즘;

import java.util.Scanner;

public class BinSerachXEx03_05 {
    static int binSearchX(int[] a, int n, int key){
        int pl = 0; //검색 범위의 첫 인덱스
        int pr = n -1; // 검색 범위의 끝 인덱스

        do {
            int centerIdx = (pl + pr)/2;
            if (a[centerIdx] == key){
                for (; pl < centerIdx; centerIdx--){
                    if (a[centerIdx-1] < key)
                        break;
                }
                return centerIdx;
            }

            else if (a[centerIdx] < key){
                pl = centerIdx + 1;
            }else {
                pr = centerIdx - 1;
            }
        }while(pl <= pr);

        return -1; //검색 실패!
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for (int i=1; i<num; i++){
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();
            }while (x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력!!
        }


        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx= binSearchX(x, num, ky);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은/는 x[" + idx + "]에 있습니다.");
    }
}
