package recursion;

import java.util.Scanner;

public class power {
//    public  static void power(int a, int b,int ans){//parameterised form
//
//        if(b==0){
//            System.out.println(ans);
//            return;
//        }
//        ans=ans*a;
//         power(a,b-1,ans);
//    }
    public static int power(int a ,int b){  //T.C =O(b)
        if(b==0)return 1;
        return a*power(a,b-1);
    }
    public static int power2(int a, int b){ //T.C =O(logb)
        if(b==0)return 1;
        int ans=power(a,b/2);
        if(b%2==0)return ans*ans;
        else{
            return ans*ans*a;
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base:");
        int a=sc.nextInt();
        System.out.println("enter power:");
        int b=sc.nextInt();
        System.out.println(power(a,b));
        System.out.println(power2(3,6));

    }
}
