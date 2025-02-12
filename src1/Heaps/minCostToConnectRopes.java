package Heaps;

import java.util.PriorityQueue;

public class minCostToConnectRopes {
    public static void main(String[] args) {
        int[] arr={2,7,4,1,8};
        PriorityQueue<Integer> pq=new PriorityQueue<>(); // min heap
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int sum=0;
        int totalSum=0;
       while (pq.size()>1){  //here we cannot use the for each method..
           int val1=pq.remove();
          int val2=pq.remove();
          sum=val2+val1;
            pq.add(sum);
          totalSum=totalSum+sum;

        }
        System.out.println(totalSum);
    }
}
