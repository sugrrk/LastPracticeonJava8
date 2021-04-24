package Random;




interface add{
    public int m1(int x,int y);
}



public class AddingTwoNum {
    public static void main(String[] args) {
        add s=(x,y)->x+y;
        System.out.println(s.m1(5,9));
    }
}
