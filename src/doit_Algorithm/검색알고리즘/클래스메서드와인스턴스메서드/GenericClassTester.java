package doit_Algorithm.검색알고리즘.클래스메서드와인스턴스메서드;

public class GenericClassTester {
    static class GenericClass<T>{
        private T xyz;

        public GenericClass(T t) {
            this.xyz = t;
        }

        T getXyz(){
            return xyz;
        }
    }
    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
