package Queues;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//time complexity=O(n)....
//space complexity=O(n)...

public class reverseQueue {
    public static void display(Queue<Integer> q) {
        for(int i=0; i<q.size(); i++) {
            int x = q.remove();
            System.out.print(x + " ");
            q.add(x);
        }
    }
    public static void reverseFirstK(Queue<Integer> q,int k){
        Stack<Integer> st=new Stack<>();
        int len=q.size();
        for(int i=1; i<=k; i++){
            int x=q.remove();
            st.push(x);
        }
        for(int i=1; i<=k; i++){
            int x=st.pop();
            q.add(x);
        }
        for(int i=1; i<=len-k; i++){
            int x=q.remove();
            q.add(x);
        }




    }
    public static void reverse(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        while (q.size()>0){
            int x=q.remove();
            st.push(x);

        }
        while(st.size()>0){
            int x=st.pop();
            System.out.print(x+" ");
            q.add(x);

        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.add(23);
        q.add(67);
        q.add(41);
        q.add(78);
        q.add(20);

        //print
      display(q);
        System.out.println();
       reverse(q);
        System.out.println();
        reverse(q);
        System.out.println();
        reverseFirstK(q,3);
        System.out.println();
        display(q);


    }



}
