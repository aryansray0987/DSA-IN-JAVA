package BitwiseOperator.java;

public class TurnOnbit {
    public static void main(String[] args) {
        int x=64;
        int k=3;//making third bit on
        int y=x|1<<k;
        System.out.println(y);

        int z=10;
         k=2;
         int Z=z|1<<k;
        System.out.println(Z);


    }
}
