import java.util.*;
public class itineraryTicketsHash {
    public static String getStart(HashMap<String, String> map){
        HashMap<String, String> revMap = new HashMap<>(); //creating a reverse map

        for(String key : map.keySet()){
            revMap.put(map.get(key), key);
        }

        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){ //if reverse map does not contains the key, it means that key is the staring point
                return key;               // because no plane goes to that city
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);
        System.out.print(start);
        for(String key : map.keySet()){
            System.out.print(" --> " + map.get(start));
            start = map.get(start);
            
            if(key == null){ // faltu code, only written to remove error
                return;
            }

        }
    }
}
