package PatternPrinting;

import java.util.Scanner;

public class AlphaBet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows:");
        int n=sc.nextInt();
        System.out.println("enter the character :");
        char cha=sc.next().charAt(0);
        for(int i=0; i<n;i++) {


            for (char ch = 'A'; ch <= cha; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
