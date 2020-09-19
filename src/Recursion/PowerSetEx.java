package Recursion;

public class PowerSetEx {
    //원본 집합
    private  String[] arr = {"a","b","c"};

    //상태 체크
    private boolean[] state = new boolean[arr.length];


    /**
     * 모든 부분집합 구하기
     *
     * @param arr   : 원본 배열
     * @param state : "있을 경우와 없을 경우" 상태값 체크
     * @param i : 현재 기준이 되는 배열 인덱스
     * @param end   : 배열의 사이즈
     */
    public void powerSet(String[] arr, boolean[] state, int i, int end){
        if (i>=end){
            for (int w=0; w<end; w++){
                if (state[w]){
                    System.out.print(arr[w]+" ");
                }
            }
            System.out.println();
            return;
        }

        //나를 포함하지 않는 경우
        state[i] = false;
        powerSet(arr,state,i+1,end);

        //나를 포함하는 경우
        state[i] = true;
        powerSet(arr,state,i+1,end);
    }
    public static void main(String[] args) {
        PowerSetEx ps = new PowerSetEx();
        ps.powerSet(ps.arr,ps.state,0,ps.arr.length);
    }
}
