package MethodReference;

import java.util.Arrays;
import java.util.List;

public class Instance1 {
    void m1(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("Java" , "Is" , "Programming" ,"Language");
        al.forEach(new Instance1() ::m1);// use as method()

    }
}
