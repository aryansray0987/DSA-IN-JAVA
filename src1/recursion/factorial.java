package recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==1 || n==0) //base case..
            return 1;
        int ans=n*fact(n-1);  // recurrence relation n*fact(n-1)
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        System.out.println(fact(n));


    }
}
