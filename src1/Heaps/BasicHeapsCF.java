package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapsCF {
    public static void main(String[] args) {
        //heap is implemented using array but visualised as complete binary tree(CBT)..
        //insertion and deletion take place in O(logN).
        //Min Heap -> smaller element will always be on top;
        //.contains(), .remove(),.remove(Obj),.size(),.add(),.poll(), .removeAll(),. and many more
        PriorityQueue<Integer> pq=new PriorityQueue<>();// By default min heap
        pq.add(23); //time complexity =O(logN)
        pq.add(-1);
        pq.add(89);
        System.out.println(pq);
        pq.remove(); // time complexity =O(logN)
        pq.add(90);
        pq.add(56);
        //if we are adding n elements one by one then time complexity =O(NlogN)
        System.out.println(pq);
        System.out.println(pq.size());//time complexity =O(1)

        //Max Heap-> larger element will always be on top
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(34);
        pq1.add(-23);
        pq1.add(39);
        pq1.add(90);
        pq1.add(65);
        System.out.println(pq.peek()); //time complexity =O(1)
        System.out.println(pq1);
        pq1.remove();
        System.out.println(pq1);
        System.out.println("hello my name is aryan gupta ");

    }
}
