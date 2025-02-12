package BitwiseOperator.java;

public class leftrightShift {
    public static void main(String[] args) {
        System.out.println(9>>2);//number is right shifted by 2 bits
        System.out.println(23<<3);

        //using the left shift we can also calculate the 2 ki power n
        //2^n=1<<n
        System.out.println(1<<3); // where 3 is value of n; time complexity O(1)


        //swapping
        int a=23;
        int b=45;

       //method 1
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+ "  " + b);

        //method 2
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+ "  " + b);
        //method 3
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+ "  " + b);




    }
}
