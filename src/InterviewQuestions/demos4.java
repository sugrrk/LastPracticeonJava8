package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class demos4 {
    public static void main(String[] args) {
        //Given a list of integers, find the min value element present in it using Stream functions?

        List<Integer> num1 = Arrays.asList(14,12,84,98,45,45,56,98,14) ;
     int min =  num1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(min);//12
//Given a list of integers, find the min value element present in it using Stream functions?
        int max = num1.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(max);//98
    }
}
