package PatternPrinting;

import java.util.Scanner;

public class StarDiamond {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i;j++){
                System.out.print(" "+ " ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){  //printing the inverse pyramid
            for(int j=1; j<=n-i;j++){
                System.out.print(" "+ " ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
