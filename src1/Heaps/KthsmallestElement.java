package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthsmallestElement {
    public static void main(String[] args) {
        int[] arr={10,2,3,8,-4,-2,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int k=3;
        for(int i=0; i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k)pq.remove();
        }
        System.out.println(pq.peek());
    }
}
