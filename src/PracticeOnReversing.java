

interface d{
    public String d1(String s);
}



public class PracticeOnReversing {
    public static void main(String[] args) {
        System.out.println("The word used for reversing is Google");
        d rev= (str->{String result="" ;
                for(int i= str.length()-1;i>=0;i--)
                 result= result+(str).charAt(i);
                  return result;});
        System.out.println(rev.d1("Google" ));

    }
}
