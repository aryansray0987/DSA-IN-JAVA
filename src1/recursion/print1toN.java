package recursion;

import java.util.Scanner;

public class print1toN {
    public static void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print(n-1);
        System.out.println(n);

        //System.out.println(n);
        //print(n-1) for printing in reverse order.



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        print(n);
    }
}
