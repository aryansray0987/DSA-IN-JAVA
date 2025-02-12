package HashSetsMaps;


import java.util.HashMap;
// order of key value pairs does not matter...
// map contains unique key but value can be repeated ...
// all the operation are performed in O(1) time complexity...


//also study the hashmap theory like hashing collision and many more for interview



public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();//key: value pair
        map.put("aryan",42);
        map.put("abhisekh",8);
        map.put("amrish",23);
        System.out.println(map);
        map.remove("aryan");
        map.get("amrish");

        System.out.println(map.size());
        System.out.println(map.get(42));
        System.out.println( map.containsValue(23)); // return null
        System.out.println(map.containsKey("aryan"));//true


        for(String key: map.keySet()){
            System.out.println(key+ " " +map.get(key));
        }

       for(int value: map.values()){
            System.out.println(value);
        }
//        System.out.println();
//        for(Object pair: map.entrySet()){
//            System.out.println(pair);
//
//        }

    }
}
