package doit_Algorithm.스택;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;


    //실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }

    //실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    //생성자


    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        }catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr -1];
    }

    public void clear() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        ptr = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        if (ptr == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        return ptr >= max;
    }

    //스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(int x) throws EmptyIntStackException{
        if (ptr <= 0)
            throw new EmptyIntStackException();
        for (int i= ptr - 1; i >= 0; i--) { //정상쪽에서 선형 검색
            if (stk[i] == x)
                return i;
        }
        return -1;
    }

    public void dump() {
        if (ptr == 0)
            System.out.println("스택이 비어 있습니다.");
        for (int i=0; i<ptr; i++) {
            System.out.print(stk[i] + ", ");
        }
        System.out.println();
    }
}
