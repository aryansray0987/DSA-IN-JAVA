package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reversefirstKelements {
    public static void display(Queue<Integer>q){
        for(int i=0; i<q.size(); i++) {
            int x = q.remove();
            System.out.print(x + " ");
            q.add(x);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        //{1,2,3,4,5,6}
        display(q);
        System.out.println("enter the number of elements to reverse:");
        int k=sc.nextInt();
        int n=q.size();




        for(int i=0; i<k; i++){
            int x=q.remove();
            st.push(x);
        }
        for(int i=0; i<k; i++){
            int x=st.pop();
            q.add(x);
        }
        for(int i=0; i<n-k; i++){
            int x=q.remove();
            q.add(x);
        }
        display(q);//{3,2,1,4,5,6}
        
    }
}
