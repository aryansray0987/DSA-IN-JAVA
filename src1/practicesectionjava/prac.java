package practicesectionjava;

import java.util.Scanner;


public class prac{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of radius");
        int r=sc.nextInt();
        double area=(Math.PI)*r*r;
        System.out.println("area of the circle is :"+ area);

    }
}
