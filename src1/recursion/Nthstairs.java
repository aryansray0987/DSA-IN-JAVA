package recursion;

import java.util.Scanner;

public class Nthstairs {
    //question: Number  of ways climbing the stair by taking only one or two steps
    //at a time....
    public static int stair(int n){
        if(n==1 || n==2)return n;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stairs:");
        int n=sc.nextInt();
        System.out.println(stair(n));
    }
}
