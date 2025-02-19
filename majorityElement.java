// given array, print all the elements which occur more than n/3 times in the array
import java.util.HashMap;
public class majorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        
        for(int i: arr){
            if(map.containsKey(i)){ //if key is already present: increase its value by 1
                map.put(i, map.get(i)+1);
            } else{
                map.put(i, 1); // if key is not present: add key with value 1
            }
            if(map.get(i) > n/3){
                System.out.println(i);
            }
        }
    }
}
