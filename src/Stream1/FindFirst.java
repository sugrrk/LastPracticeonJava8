package Stream1;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(10,12,15,14,18);
        //l1.stream().filter(x->x%2==0).forEach(System.out::println);
        //l1.stream().filter(x->x%2!=0).forEach(System.out::println);
        l1.stream().findFirst().ifPresent(System.out::println);
        Boolean match=l1.stream().anyMatch(x->x>10);
        System.out.println(match);
    }
}
