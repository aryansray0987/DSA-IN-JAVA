package Heaps;

import java.util.PriorityQueue;

public class KthLargest {
    //find the kth largest element
    public static void main(String[] args) {
        int[] arr={10,2,3,8,-4,-2,6};
        int k=4;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        System.out.println(pq);
        for(int i=0; i<k-1; i++){
            pq.remove();
        }
        System.out.println(pq.peek());

    }
}
