package Stacks;

import java.util.Scanner;
import java.util.Stack;


//question: Here we are returning the number of brackets that we need
//to balanced out the brackets....



public class BalancedBracket2 {
    public static int isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
                count++;

            } else { // ch=')'
                if (st.size() == 0) {
                    System.out.println("Brackets can not be balanced");
                    return -1;
                }
                if (st.peek() == '(') {
                    st.pop();
                    count--;

                }


            }


        }
        return count;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.next();
        int x=isBalanced(str);
        System.out.println("number of brackets that we need to balanced is :"+ x);
    }
}
