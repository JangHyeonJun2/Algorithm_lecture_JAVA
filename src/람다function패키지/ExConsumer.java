package 람다function패키지;

import java.util.function.Consumer;

public class ExConsumer {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Pineapple");
        c.accept("Strawberry");
    }
}
