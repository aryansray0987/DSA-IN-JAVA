package recursion;

import java.util.Scanner;

public class Fibonaccinum {
    //started form the 0th term
    //0th term->0 , 1th-term -> 1 , 2nd term-> 1 ...so on
    public  static int Fibonacci(int n){
        if(n==0 || n==1)return n;
        if(n==2)return n-1;


        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a term:");
        int n=sc.nextInt();
        int x=Fibonacci(n);
        System.out.println(x);


    }
}
