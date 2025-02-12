package HashSetsMaps;

import java.util.HashMap;
import java.util.HashSet;

public class twosum {
    //Time complexity =O(n)..  using HashMaps

    public static void main(String[] args) {
        int[] arr={1,2,3,40,5};
        int target=45;
        int result[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int remain=target-arr[i];
            if(!map.containsKey(remain)){
                map.put(arr[i],i);

            }
            else {
                result[0]=map.get(remain);
                result[1]=i;
            }
        }
       for(int i=0; i<result.length; i++){
           System.out.print(result[i]+ " ");
       }
    }
}
