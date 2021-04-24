package Random;





interface reverse1{
    public String back(String a);
}








public class Reversing1 {
    public static void main(String[] args) {
        reverse1 b = (str)->{String result="";
                         for(int i= str.length()-1;i>=0;i--)
                             result = result+str.charAt(i);
                         return result;};
        System.out.println(b.back("coffee"));

    }
}
