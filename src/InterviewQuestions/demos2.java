package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// find out number starts with 1
//to use starts with method we have to first change to string.
public class demos2 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(14,25,12,24,18,36);

        List<String> str = Arrays.asList("pen","Pencil","Ruler","Eraser","Mouse");
        num.stream().map(s->s+"").filter(s->s.startsWith("3")).forEach(System.out::println);


        //Using map to use upper case and filter for conditional check.
       List<String> result= str.stream().map(s->s.toUpperCase()).filter(s->s.startsWith("P")).collect(Collectors.toList());
        System.out.println(result);
    }
}