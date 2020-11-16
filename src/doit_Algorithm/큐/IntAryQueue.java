package doit_Algorithm.큐;

public class IntAryQueue {
    private int max;
    private int num;
    private int[] que;
    private int front;
    private int rear;
    private int capacity;


    public class EmptyIntQuekException extends RuntimeException {
        public EmptyIntQuekException(){

        }
    }

    public class OverflowIntQuekException extends RuntimeException {
        public OverflowIntQuekException(){

        }
    }


    public IntAryQueue(int capacity) {
        max = capacity;
        num = 0;
        front = 0;
        rear = 0;

        try {
            que = new int[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public void enque(int number) throws OverflowIntQuekException{
        if (rear >= max){
            throw new OverflowIntQuekException();
        }

        que[rear++] = number;
        num++;

        if (rear == max)
            rear = 0;
    }

    public int deque() throws EmptyIntQuekException{
        if (rear <= front){
            throw new EmptyIntQuekException();
        }


        int x = que[front++];
        num--;

        if (front == max)
            front = 0;
        return x;
    }

    public int peek() throws EmptyIntQuekException{
        if (num <= 0){
            throw new EmptyIntQuekException();
        }

        return que[front];
    }

    public int indexOf(int x){
        for (int i=0; i<num; i++){
            int idx = (i+front) % max;
            if(que[idx] == x)
                return idx; //검색 성공
        }
        return -1; //검색 실패
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
