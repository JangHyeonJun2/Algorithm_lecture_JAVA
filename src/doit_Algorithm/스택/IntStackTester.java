package doit_Algorithm.스택;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        GStack2<Integer> s = new GStack2<>(64); //최대 64개를 푸시할 수 있는 스택
//        IntStack s = new IntStack(32);

        while (true) {
            System.out.println("현재 데이터 수: " + s.size() + "/ " +s.capacity());
            System.out.print("(1) push (2)pop (3)peek (4)dump (5)indexOf (6)clear (0)exit");

            int menu = stdIn.nextInt();
            if (menu == 0)
                break;

            int x =0;
            switch (menu) {
                case 1:
                    System.out.print("Data: ");
                    x = stdIn.nextInt();
                    try{
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("Stack is Full");
                    }
                    break;
                case 2:
                    try {
                        x = s.pop();
                        System.out.println("Data is : " + x);
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("Data is " + x);
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    try {
                        x = stdIn.nextInt();
                        System.out.println("search Data is location = " + s.indexOf(x));
                    }catch (GStack2.EmptyIntStackException e) {
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 6:
                    try{
                        s.clear();
                        System.out.println("모든 데이터가 지워졌습니다.");
                    }catch (GStack2.EmptyIntStackException e) {
                        System.out.println("Stack is empty");
                    }
                    break;
            }
        }
    }
}
