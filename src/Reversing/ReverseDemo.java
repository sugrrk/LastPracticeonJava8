package Reversing;


interface Reverse{
    public String rev (String x);
}


public class ReverseDemo {
    public static void main(String[] args) {
        Reverse r =(str)->{String result= "";
                  for(int i = str.length()-1;i>=0;i--)
                  result = result+str.charAt(i);
                   return result;};
        System.out.println(r.rev("Shreya"));
    }
}
