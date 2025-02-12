package Queues;

import java.util.*;

public class deque {
    //add() , remove()/poll()   , peek()
    public static void main(String[] args) {
        Deque<Integer> dq= new ArrayDeque<>();
        //deque is double ended queue so insertion deletion from both the ends
        dq.add(34);
        dq.add(21);
        dq.add(87);
        dq.add(52);
        dq.add(85);
        dq.addFirst(30);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
