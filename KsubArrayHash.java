import java.util.*;
public class KsubArrayHash {
    public static int kSubArrays(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); //why is this written? -> if map.containskey(subSum-k) = 0, so to handle this..
        int subSum = 0;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){ //O(N)
            subSum += arr[i];
            if(map.containsKey(subSum-k)){
                ans += map.get(subSum-k);
            }
            map.put(subSum, map.getOrDefault(subSum, 0) + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        System.out.println(kSubArrays(arr, -10));
    }
}
