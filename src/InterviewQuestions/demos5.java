package InterviewQuestions;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, sort all the values present in it using Stream functions?
public class demos5 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> asc =myList.stream().sorted().collect(Collectors.toList());
        System.out.println(asc);


        //descending order
        List<Integer> desc = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(desc);


    }
}
