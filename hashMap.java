import java.util.*;
public class hashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>(); //<key, value>
        map.put("India", 150);
        map.put("China", 200);
        map.put("US", 100);


        System.out.println(map);
        int population = map.get("China");
        
        System.out.println("China's population = " + population);
        System.out.println(map.containsKey("Nepal"));
        map.remove("US");

        System.out.println(map);

        map.put("Nepal", 50);
        // iteration in hashmap
        Set<String> keys = map.keySet(); //creates a set of key values
        //we can use hm.entrySet() for storing values in a set
        // we can iterate over these key values
        for(String k : keys) { // for-each loop
            System.out.println("key = " + k + "," + " value = " + map.get(k));
        } 
    }
}
