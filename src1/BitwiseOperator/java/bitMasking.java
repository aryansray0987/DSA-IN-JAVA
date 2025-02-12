package BitwiseOperator.java;

public class bitMasking {
    public static void main(String[] args) {
        int a=32;
        int k=2;

        int mask=1<<k;
        if((k&1)==0) System.out.println("bit is off");
        if((k&1)!=0) System.out.println("bis is on");

        //another way
        int b=10;
         k=1 ;
         int x=b>>k;
         if(x%2==0) System.out.println(0);
         else System.out.println(1);

    }
}
