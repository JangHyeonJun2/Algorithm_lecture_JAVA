package doit_Algorithm.큐;

public class Gqueue<E> {
    private int max;
    private int num;
    private E[] que;
    private int front;
    private int rear;
    private int capacity;


    public static class EmptyIntQuekException extends RuntimeException {
        public EmptyIntQuekException(){

        }
    }

    public static class OverflowIntQuekException extends RuntimeException {
        public OverflowIntQuekException(){

        }
    }


    public Gqueue(int capacity) {
        max = capacity;
        num = 0;
        front = 0;
        rear = 0;

        try {
            que = (E[]) new Object[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public void enque(E number) throws OverflowIntQuekException{
        if (rear >= max){
            throw new OverflowIntQuekException();
        }

        que[rear++] = number;
        num++;

//        if (rear == max)
//            rear = 0;
        System.out.println("front : " + front + ", " + "rear : " + rear);
    }

    public E deque() throws EmptyIntQuekException{
        if (rear <= front){
            throw new EmptyIntQuekException();
        }


        E x = que[front++];
        num--;

        if (front == max)
            front = 0;

        System.out.println("front : " + front + ", " + "rear : " + rear);
        return x;
    }

    public E peek() throws EmptyIntQuekException{
        if (num <= 0){
            throw new EmptyIntQuekException();
        }

        return que[front];
    }

    public int indexOf(E x){
        for (int i=0; i<num; i++){
            int idx = (i+front) % max;
            if(que[idx] == x)
                return idx; //검색 성공
        }
        return -1; //검색 실패
    }

    public int search(E x) throws EmptyIntQuekException{
        for (int i=0; i<num; i++){
            if (que[(i+front) % max] == x)
                return i+1;
        }
        return -1;
    }

    //큐을 비우는 메서드
    public void clear(){
        num = front = rear = 0;
    }
    //큐의 용량을 보여주는 메서드
    public int capacity(){
        return max;
    }

    //큐에 쌓여있는 데이터 수를 반환
    public int size(){
        return num;
    }

    //큐이 비어 있는가?
    public boolean isEmpty(){
        return num <= 0; //prt가 0이면서 작으면 true를 반환
    }

    public boolean isFull(){
        return num >= max;
    }

    public void dump(){
        if (num <= 0)
            System.out.println("스택이 비어 있습니다.");
        else
            for (int i=0; i<num; i++){
                System.out.print(que[(i+front) % max] + " ");
            }
        System.out.println();
    }
}
