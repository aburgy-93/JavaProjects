package mypackage;

import java.util.HashMap;

public class Hashmap {
    // HashMap = A data structure that stores key-value pairs
    //          Keys are unique, but Values can be duplicated
    //          Does not maintain any order, but is memory efficient
    //          HashMap<Key, Value>

   public void createHashMap() {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.25);
        map.put("Coconut", 1.00);
        
        // System.out.println(map);

        // map.remove("apple");

        // System.out.println(map);

        System.out.println(map.get("Apple"));

        System.out.println(map.containsKey("banana"));

        for(String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
   }
}
