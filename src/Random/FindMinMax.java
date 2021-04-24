package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,45,12,5,9,14);
       //Optional<Integer> max = al.stream().max((x, y)->{return x.compareTo(y);});
        int max = al.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(max);

        Optional<Integer> min = al.stream().min((a,b)->{return a.compareTo(b);});
        System.out.println(min.get());
    }
}
