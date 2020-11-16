package doit_Algorithm.큐;

import java.util.Scanner;

public class IntAryQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntAryQueue s = new IntAryQueue(12);

        while(true){
            System.out.println("현재 데이터 수 : " + s.size() + " /" + s.capacity());
            System.out.print("(1)push  (2)pop  (3)peek  (4)dump  (5)search  (0)exit  : ");
            int menuButton = sc.nextInt();

            if(menuButton == 0)
                break;

            int x;
            switch (menuButton){
                case 1:
                    System.out.print("Data : ");
                    x = sc.nextInt();
                    try{
                        s.enque(x);
                    }catch (IntAryQueue.OverflowIntQuekException e){
                        System.out.println("Stack is Full...");
                    }
                    break;

                case 2:
                    try {
                        x = s.deque();
                        System.out.println("Data is " + x);
                    }catch (IntAryQueue.EmptyIntQuekException e){
                        System.out.println("Stack is Empty...");
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Data is " + s.peek());
                    }catch (IntAryQueue.EmptyIntQuekException e){
                        System.out.println("Stack is Empty...");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.print("찾고 싶은 값의 위치를 알려드립니다. 값을 입력하세요 : ");
                    int num = sc.nextInt();

                    try {
                        x = s.search(num);
                        System.out.println("위치는 : " + x + " 입니다.");
                    }catch (IntAryQueue.EmptyIntQuekException e){
                        System.out.println("Stack is Empty...");
                    }
                    break;
            }
        }
    }
}
