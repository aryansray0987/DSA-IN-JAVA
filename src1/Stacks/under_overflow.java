package Stacks;

import java.util.Stack;

public class under_overflow {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(23);
        st.push(33);
        st.push(67);
        st.push(27);
        st.push(14);

        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.peek();
        System.out.println();
//
    }
}
