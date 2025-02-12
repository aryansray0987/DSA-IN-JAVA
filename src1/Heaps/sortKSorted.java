package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class sortKSorted {
    //using heaps to sort k sorted array O(NlogK) // nearly k sorted (imp for interviews)..
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,10,9};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        int k=3;
        for (int i = 0; i <arr.length ; i++) {
            pq.add(arr[i]);
            if(pq.size()>k)arr1.add(pq.remove());
        }
        while(pq.size()>0){
            arr1.add(pq.remove());
        }
        System.out.println(arr1);
    }
}
