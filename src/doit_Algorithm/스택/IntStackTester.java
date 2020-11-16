package doit_Algorithm.스택;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gstack s = new Gstack(64);

        while(true){
            System.out.println("현재 데이터 수 : " + s.size() + " /" + s.capacity());
            System.out.print("(1)push  (2)pop  (3)peek  (4)dump  (0)exit  : ");
            int menuButton = sc.nextInt();

            if(menuButton == 0)
                break;

            Object x;
            switch (menuButton){
                case 1:
                    System.out.print("Data : ");
                    x = sc.nextInt();
                    try{
                        s.push(x);
                    }catch (Gstack.OverflowIntStackException e){
                        System.out.println("Stack is Full...");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.println("Data is " + x);
                    }catch (Gstack.EmptyIntStackException e){
                        System.out.println("Stack is Empty...");
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Data is " + s.peek());
                    }catch (Gstack.EmptyIntStackException e){
                        System.out.println("Stack is Empty...");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
