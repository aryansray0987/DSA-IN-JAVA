package Stacks;


import java.util.Stack;
import java.util.Scanner;

public class cpyStack {
    public static void displayreverse(Stack<Integer> st){//print the elements in reverse order
        if(st.size()==0) return;
        int top=  st.pop();
        System.out.print(top+ " ");
        displayreverse(st);

        st.push(top);

    }
    public static void pushAtBottom(Stack<Integer> st,int n){//push element at Bottom recursively
        if(st.size()==0){
            st.push(n);
            return;
        }
        int top=  st.pop();
        pushAtBottom(st, n);
        st.push(top);
    }
    public static void REMOVEATIDX(int idx,Stack<Integer> st){
        if(idx==4){
            st.pop();
            return;
        }
        int top=  st.pop();
        REMOVEATIDX(idx-1,st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("enter the elements :");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
//        System.out.println(st);
//        Stack<Integer> st1=new Stack<>();
//        Stack<Integer> st2=new Stack<>();
//        while (st.size()>0){
////            int y=st.pop();
////            st1.push(y);
//            st1.push(st.pop());
//
//        }
//        while(!st1.isEmpty()){ //s1.size()>0...
//            st2.push(st1.pop());
//        }
//        System.out.println(st2);

       // displayreverse(st);
        pushAtBottom(st,9);
        displayreverse(st);
        System.out.println();
        REMOVEATIDX(st.size(),st);
        displayreverse(st);


    }
}
