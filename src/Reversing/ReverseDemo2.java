package Reversing;

interface reversing{
    public String rev(String s);
}



public class ReverseDemo2 {
    public static void main(String[] args) {
        reversing d = (str)->{String result = "";
                      for(int i = str.length()-1;i>=0;i--)
                       result = result+(str.charAt(i));
                        return result;};
        System.out.println(d.rev("Programming"));


    }
}
