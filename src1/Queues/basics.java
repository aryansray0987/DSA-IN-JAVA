package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        // main functions : add(), remove()/poll() , peek()
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
      //  q.poll();
       // System.out.println(q);
//        System.out.println(q.peek());
        for(int i=0;i<q.size(); i++){
            int x=q.remove(); //can also be done using extra queue...
            System.out.print(x+" ");
            q.add(x);
        }
        System.out.println();
        System.out.println(q);
    }
}
