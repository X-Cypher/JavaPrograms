
//find largest sub array with sum = 0

import java.util.*;
public class subArrayHash {
    public static int arraySum(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int subArray = 0;
        int length = 0;
        
        //find sub arrays and put them in map with index
        // when same sum is found, then calculate difference b/w their idx and store in answer
        for(int i = 0; i < arr.length; i++){
            subArray += arr[i];
            if(map.containsKey(subArray)){
                length = Math.max(length, (i - map.get(subArray)));
            } else{
                map.put(subArray, i);
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10};
        System.out.println(arraySum(arr));
    }
}