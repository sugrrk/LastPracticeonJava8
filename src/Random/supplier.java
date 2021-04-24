package Random;

import java.util.Date;
import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<Date> d = Date::new;
        System.out.println(d.get());


    }
}
;