package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//given list of integers and find the even numbers
public class demos1 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(14,25,12,24,18,36);
        List<Integer> evennum = num.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evennum);

    }
}
