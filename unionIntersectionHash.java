import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class unionIntersectionHash {
    public static HashSet<Integer> Union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1){
            set.add(i);
        }
        for(int i: arr2){
            set.add(i);
        }
        System.out.println("Union size = " + set.size());
        return set;
    }
    public static ArrayList<Integer> Intersection(int arr1[], int arr2[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : arr1){
            map.put(i, 1);
        }
        for(int i : arr2){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Set<Integer> keys = map.keySet();
        for(Integer s: keys){
            if(map.get(s) > 1){
                al.add(s);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9,4};
        int arr2[] = {6,3,9,2,9,4};
       System.out.println(Intersection(arr1, arr2));
    }
}
