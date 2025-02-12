package DynamicprogrammingDP;

import java.util.Scanner;

public class fibonacci {
    static int[]dp;
//fibonacci number using Dynamic Programming
    //T.C=O(N)....

    public static int fibo(int n){
        if(n<=1) return n;
        if(dp[n]!=0)return dp[n];
        int ans=fibo(n-1)+fibo(n-2);
        dp[n]=ans;
        return ans;
        //or return dp[idx]=fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");

        int n=sc.nextInt();
        dp=new int[n+1];


        int result=fibo(n);
        System.out.println(result);

        //using simple array   T.C=O(N)
//        int[] dp=new int[n+1];
//        dp[0]=0; dp[1]=1;
//        for(int i=2; i<=n; i++){
//            dp[i]=dp[i-1]+dp[i-2];
//
//        }
//        return dp[n];

    }
}
