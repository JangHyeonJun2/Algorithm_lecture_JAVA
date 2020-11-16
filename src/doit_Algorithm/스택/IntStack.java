package doit_Algorithm.스택;

public class IntStack {
    private int max; //스택 용량
    private int prt; //스택 포인터
    private int[] stk; //스택 본채

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){

        }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){

        }
    }

    public IntStack(int capacity) {
        prt = 0;
        max = capacity;

        try{
            stk = new int[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }

    }

    public void push(int number) throws OverflowIntStackException{
        if (prt == max -1){
            throw new OverflowIntStackException();
        }
        stk[prt++] = number;
    }

    public int pop() throws EmptyIntStackException{
        if (prt <= 0)
            throw new EmptyIntStackException();

        return stk[--prt]; //여기서 왜 전위 연산자를 쓰는 이유는 push를 할 때 이미 prt가 먼저 올라가 있기 때문에이다. 그래서 먼저 감소를 시켜주고 return을 시켜줘야한다.
    }

    public int peek() throws EmptyIntStackException{
        if (prt <= 0)
            throw new EmptyIntStackException();

        return stk[prt-1]; //보여지는 것이기 때문에 prt를 감소할 필요는 없다.
    }

    //스택을 비우는 메서드
    public void clear(){
        prt = 0;
    }
    //스택의 용량을 보여주는 메서드
    public int capacity(){
        return max;
    }

    //스택에 쌓여있는 데이터 수를 반환
    public int size(){
        return prt;
    }

    //스택이 비어 있는가?
    public boolean isEmpty(){
        return prt <= 0; //prt가 0이면서 작으면 true를 반환
    }

    public boolean isFull(){
        return prt >= max;
    }

    public void dump(){
        if (prt <= 0)
            System.out.println("스택이 비어 있습니다.");
        else
            for (int i=0; i<prt; i++){
                System.out.print(stk[i] + " ");
            }
        System.out.println();
    }

}
