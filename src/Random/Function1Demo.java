package Random;

import java.util.function.Function;

public class Function1Demo {
    public static void main(String[] args) {
        Function<String,String> fn = s->s.toUpperCase();
        System.out.println(fn.apply("Entrepreneur"));


    }
}
