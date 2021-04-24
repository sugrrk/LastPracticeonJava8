package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constructors {
    public Constructors(String s) {
        System.out.println("The strings are" + s);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("Java" , "Is" , "Programming" ,"Language");

            al.forEach(Constructors::new);
        }
    }

