package RewindLast;


interface rev1{
   public String back(String s);
}



public class Rewind {
    public static void main(String[] args) {
        rev1 rev = s->{String result= "";
                     for(int i = s.length()-1;i>=0;i--)
                      result= result+(s.charAt(i));
                      return result;};

        System.out.println(rev.back("malayalam"));
    }
}
