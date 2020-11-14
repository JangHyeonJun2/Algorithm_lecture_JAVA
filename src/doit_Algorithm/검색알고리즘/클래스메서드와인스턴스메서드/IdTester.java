package doit_Algorithm.검색알고리즘.클래스메서드와인스턴스메서드;

class Id {
    private static int counter = 0; //아이디를 몇개 부여했는지 저장
    private int id; //아이디

    public Id() {
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public static int getCounter(){
        return counter;
    }
}
public class IdTester{
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 아이디 " + a.getId());
        System.out.println("b의 아이디 " + b.getId());

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
    }
}
