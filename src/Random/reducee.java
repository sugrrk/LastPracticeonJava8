package Random;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reducee {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A","B","1","G","5");
        //Optional<String> l= names.stream().reduce((value, combinedvalue)->{return value+combinedvalue;});
        //System.out.println(l);

        Optional<String> P= names.stream().reduce((value,combinedvalue)->{return value+combinedvalue;});
        System.out.println(P);
        Object  arr[]= names.stream().toArray();
        System.out.println(arr.length);


    }
}
