package Random;

import java.util.*;
import java.util.stream.Collectors;

public class Reducing {
    public static void main(String[] args) {
        List<String>r = Arrays.asList("1","A","S","5","2","K");
        List<String> s= new ArrayList<String>();
       Optional<String> d = r.stream().reduce((value, combinedvalue)->{return combinedvalue+value;});
        System.out.println(d.get());
      s=  r.stream().sorted((Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(s);
        long count = r.stream().count();
        System.out.println(count);

    }
}
