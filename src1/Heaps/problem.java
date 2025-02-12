package Heaps;


import java.util.PriorityQueue;
public class problem {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(9);
        pq.add(-23);
        pq.add(1);
        System.out.println(pq.contains(1));
        System.out.println(pq.remove(9));
        System.out.println(pq);
    }
}
























