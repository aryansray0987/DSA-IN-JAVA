package recursion;

import java.util.Scanner;

public class printsum {
//    public static int printsum(int n){
//        if(n==0) return 0;
//        int ans=n+printsum(n-1);
//        return ans;
//    }
public static void  printsum(int n,int s){  //parameterised form
    if(n==0){
        System.out.println(s);
        return;
    }
    printsum(n-1,s+n);

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
       // int x=printsum(n);
        printsum(n,0);
      //  System.out.println("sum of the first "+ n+ " natural number is:"+ x);
    }
}
