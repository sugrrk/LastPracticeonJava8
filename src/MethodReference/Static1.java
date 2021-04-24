package MethodReference;

import java.util.Arrays;
import java.util.List;

public class Static1 {
    public static void m1(String s){
        System.out.println("  "+s);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("Java" , "Is" , "Programming" ,"Language");
        al.forEach(Static1::m1);

    }
}
