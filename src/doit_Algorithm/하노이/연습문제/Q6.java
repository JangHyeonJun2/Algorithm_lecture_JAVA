package doit_Algorithm.하노이.연습문제;

import java.util.Scanner;

public class Q6 {
    static void move(int no, char from, char mid, char to) {
        if (no == 1){
            System.out.println(no + "를 " + from + "에서 " + to + "로 옮깁니다.");

        } else{
            move(no -1,from, to, mid);
            System.out.println(no + "를 " + from + "에서 " + to + "로 옮깁니다.");
            move(no -1,mid,from,to);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int n = sc.nextInt();

//        move(n,1,3); //1번 기둥의 n개의 원반을 3번 기둥으로 옮
        move(n,'A','B','C');
    }
}
