package Stacks;

import java.util.Stack;

public class HIstogramProblem {
    public static void main(String[] args) {
        int[] arr={5,2,4,6,3,2};
        int n=arr.length;
        int[]res=new int[n];
        Stack<Integer> st = new Stack<>();
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size()>0  && st.peek() > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        int[] res1=new int[n];
        Stack<Integer> rt=new Stack<>();
        rt.push(arr[0]);
        res1[0]=-1;
        for(int i=1; i<n; i++){
            while(rt.size()>0 && rt.peek()>arr[i]){
                rt.pop();
            }
            if(rt.isEmpty()){
                res1[i]=-1;
            }
            else{
                res1[i]=rt.peek();
            }
            rt.push((arr[i]));
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(res1[i]+" ");
        }
    }
}
