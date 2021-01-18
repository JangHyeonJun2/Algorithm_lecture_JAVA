package doit_Algorithm.스택;

public class GStack2<E> {
    private int max;
    private int ptr;
    private E[] stk;

    //실행 시 예외 : 스택이 비어 있음
    public  static class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }

    //실행 시 예외 : 스택이 가득 참
    public static class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public GStack2(int capacity) {
        ptr = 0;
        this.max = capacity;
        try{
            stk = (E[])new Object[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }
    public E push(E x) throws OverflowIntStackException {
        if (ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public E peek() throws EmptyIntStackException {
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
    public <E extends Number> int indexOf(E x) throws EmptyIntStackException{
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
