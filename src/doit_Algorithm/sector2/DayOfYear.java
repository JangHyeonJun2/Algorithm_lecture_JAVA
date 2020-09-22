package doit_Algorithm.sector2;

import java.util.Scanner;

public class DayOfYear {
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31}, // 평년
            {31,29,31,30,31,30,31,31,30,31,30,31}, // 윤년
    };
    //서기 year년은 윤녀인가? (윤년: 1/ 평년: 0)
    static int isLeap(int year){
        /**
         * 윤년 평년 계산기(알아두기)
         */
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1: 0;
    }

    //서기 y년 m월 d일의 그 해 경과 일 수 를 구함
    static int dayOfYear(int y, int m, int d){
//        int days = d; //일수
//
//        for (int i=1; i<m; i++){ // 1월  ~ (m-1)월의 일 수를 더함
//            days += mdays[isLeap(y)][i-1]; // isLeap(y)가 윤년이면 1, 평년이면 0
//        }

        /**
         * Q8. 변수 i와 days없이 구현해보기
         */
        while (m-1 > 0){
            d+=mdays[isLeap(y)][m-1];
            m--;
        }
        return d;
    }

    /**
     * Q9. y년 m월 d일의 그 해 남은 일 수(12월 31이면 0, 12월 30일이면 1)를 구하는 아래 메서드를 작성하세요.
     */
    static int leftDayOfYear(int y, int m, int d){
        //한 해의 전체 일 수 구하기
        int totaldays = totalDayOfYear(y);
        int days = d; //사용자가 입력한 일 수

        for (int i=1; i<m; i++) { // 1월  ~ (m-1)월의 일 수를 더함
            days += mdays[isLeap(y)][i-1]; // isLeap(y)가 윤년이면 1, 평년이면 0
        }

        return (totaldays - days);
    }

    static int totalDayOfYear(int y){
        int tDays = 0;
        for (int i=0; i<12; i++){ //왜 12로 고정이나면 그 해의 12월 31일까지의 일 수를 알아야 하기 떄문에 12로 고정해놓음
            tDays += mdays[isLeap(y)][i];
        }
        return tDays;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int retry;

        System.out.println("1. 그 해 경과 일수를 구합니다.");
        System.out.println("2. 그 해 남은 일수를 구합니다.");

        do {
            System.out.print("년 : "); int year = sc.nextInt(); //년
            System.out.print("월 : "); int month = sc.nextInt(); //월
            System.out.print("일 : "); int day = sc.nextInt(); //일

            System.out.printf("1. 그 해 %d일째 입니다.\n",dayOfYear(year,month,day));
            System.out.printf("2. 그 해 남은 일 수는 %d일 남았습니다.\n",leftDayOfYear(year,month,day) );
//            System.out.println(totalDayOfYear(year));

            System.out.print("한 번 더 할까요? (1.예 / 2.아니오) : ");
            retry = sc.nextInt();
        }while (retry == 1);
    }
}
