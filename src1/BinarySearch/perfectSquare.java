package BinarySearch;

import java.util.Scanner;

public class perfectSquare {
 // check whether the given number is perfect square or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        boolean flag=false;
        int start=1;
        int end=n;
        while(start<=end){ //T.C=O(log N)
            int mid=start+(end-start)/2;
            if(mid==n/mid){
                flag=true;
                break;
                //If break statement is not written then you will never able to come out of the loop
            }
            else if(mid>n/mid){
                end=mid-1;

            }
            else start=mid+1;
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
