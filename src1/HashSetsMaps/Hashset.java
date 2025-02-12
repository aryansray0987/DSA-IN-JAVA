package HashSetsMaps;

import java.util.HashSet;
// some important functions of HashSet are:
//add(), .size(), .clear() , .contains() , .remove();
//elements are inserted in random order
//we use for each loop to traverse not for loop because there is no concept of index
// occurrence of every element is 1; repetition is not allowed  

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> has=new HashSet<>();
//        //insertion: T.C =O(1)
        has.add(34);
        has.add(98);
        has.add(95);
        has.add(12);
        System.out.println(has);
//        //search: T.C = O(1)
//        boolean x=has.contains(13);
//        System.out.println(x);
         has.add(13);
//        x=has.contains(13);
//        System.out.println(x);
//        System.out.println(has.size());
//        //iterating over HashSets


      has.remove(13);
        System.out.println(has);
   //   Object arr[]=  has.toArray();
      //  System.out.println(arr[3]);

        for(int ele: has) {
            System.out.print(ele + " ");
//       has.clear(); TO REMOVE ALL THE ELEMENTS

        }
        System.out.println();
        System.out.println();



        //conversion of set to array
//        Object[] arr=has.toArray();
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]+" ");
//        }


    }
}
