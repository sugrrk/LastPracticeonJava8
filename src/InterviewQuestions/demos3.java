package InterviewQuestions;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// How to find duplicate elements in a given integers list in java using Stream functions?
public class demos3 {
    public static void main(String[] args) {
        List<Integer> num1 = Arrays.asList(14,12,84,98,45,45,56,98,14) ;
//        Set<Integer> num2 = new HashSet<Integer>();
//        num1.stream().filter(s-> !num2.add(s)).forEach(System.out::println);
//
//
//
//        //Given the list of integers, find the first element of the list using Stream functions?
//        num1.stream().findFirst().ifPresent(System.out::println);

        //Given a list of integers, find the total number of elements present in the list using Stream functions?

         long count =      num1.stream().count();
        System.out.println(count);
    }
}
