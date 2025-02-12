package Stacks;
import java.util.Stack;

public class stockSpanpart2 {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        //using index we are going to solve the problem
        Stack<Integer> st=new Stack<>();
        int[] res=new int[arr.length];

        int diff;
        st.push(0);
        res[0]=1;
        for(int i=1; i<arr.length; i++){
            while (arr[st.peek()]<arr[i]){
                st.pop();
            }
            diff=i-st.peek();
            res[i]=diff;
            st.push(i);
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }

    }
}
