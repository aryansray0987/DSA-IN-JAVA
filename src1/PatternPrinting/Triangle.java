package PatternPrinting;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
//        for(int i=0; i<n; i++){
//            for(int j=n; j>i;j--){
//              //  for(int j=0; j<n-i+1; j++) -- this code can also be used
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){
                if(i+j>=n+1){
                    System.out.print("*"+ " ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
