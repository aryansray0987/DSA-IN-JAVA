package recursion;

import java.util.Scanner;

public class HCF {
    public  static int hcf(int a,int b){
        if(b%a==0)return a;
        return hcf(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(hcf(a,b));
    }
}
