package Stacks;
import java.util.Stack;
public class StockSpanproblem {
    public static void main(String[] args) {
        Stack<Integer>  st=new Stack<>();
        Stack<Integer>  rt=new Stack<>();
        int[] arr={100,80,60,70,60,75,85};
        int len=1;
        int[] res=new int[arr.length];
        res[0]=1;
        st.push(100);
        for(int i=1; i<arr.length; i++){
            len=1;
            while(arr[i]>st.peek() && st.size()>0){
                len++;
               int x= st.pop();
               rt.push(x);
            }
            while(rt.size()>0){
                st.push(rt.pop());
            }
            res[i]=len;
            st.push(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0 ; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
