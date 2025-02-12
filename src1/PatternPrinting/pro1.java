package PatternPrinting;

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
//        for(int i=0; i<4; i++){
//            for (int j = 0; j <5 ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

//                * * * *
//              * * * *
//            * * * *
//           * * * *
//
//        int n=sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" " + " ");
//
//            }
//            for(int k=1;k<=n; k++){
//                System.out.print("*" +" ");
//            }
//            System.out.println();
//        }



//              1
//            1 2 1
//          1 2 3 2 1
//        1 2 3 4 3 2 1


//        int n=sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int k=1; k<=n-i; k++){
//                System.out.print(" " +" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            for(int l=i-1; l>=1; l--){
//                System.out.print(l+" ");
//            }
//
//            System.out.println();
//        }
//
//  * * * * * * *
//  * * *   * * *
//  * *       * *
//  *           *



        int n=sc.nextInt();
        int a=1;
        for(int i=1; i<=n-1; i++){
            if(a==1){
                for(int p=1; p<=2*n-1; p++ ){
                    System.out.print("*"+" ");
                }
                System.out.println();
                a++;
            }
            for(int j=n;j>i;j--){
                System.out.print("*"+" ");
            }
            for(int k=1;k<=2*i-1; k++){
                System.out.print(" "+" ");
            }
            for(int l=1; l<n-i+1;l++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
}
