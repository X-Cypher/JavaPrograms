import java.util.*;

public class stringAnagramByHashMap {
    public static void main(String[] args) {
        String s = "keen";
        String t = "knee";
        boolean flag = true;
        HashMap<Character, Integer> map = new HashMap<>();

        // adding values of "s" in hashmap
        for (int i=0; i<s.length(); i++) {
            char x = s.charAt(i);
            if(map.containsKey(s.charAt(i))){// if character is already present, increase its value by 1
                map.put(x, map.get(x)+1);
            } else{
                map.put(x, 1);// if character is not present, add it with value = 1
            }
        }
        // Comparing t with map
        //we decrease values of keys until they are 0, when they are 0, we remove the key from map
        for(int j=0; j<t.length(); j++){
            char y = t.charAt(j);
            if(map.containsKey(y)){// if character is present: 
                if(map.get(y) == 1){// if character value is 1, then remove the element
                    map.remove(y);
                } else{ // if character value is not 1, then decrease its value by 1 
                    map.put(y, map.get(y)-1);
                }
            } else{ // if the character is not present, then strings are Not Anagram
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Anagram");
        } else{
            System.out.println("Not Anagram");
        }
    }
}
