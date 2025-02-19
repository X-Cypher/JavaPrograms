import java.util.*;

public class maxConsecutiveSequenceHashMap {
    public static ArrayList<Integer> Sequence(int arr[]){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            //if previous number is present, then the current number cannot be the starting of a sequence
            if(map.containsKey(arr[i] - 1)){
                map.put(arr[i], false);
            } else{
                map.put(arr[i], true);
            }

            if(map.containsKey(arr[i]+1)){ // if next consecutive number is present, then it can not be starting of seq.
                map.put(arr[i]+1, false);
            }
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        int max_length = Integer.MIN_VALUE;
        int starting_num = 0;//stores the starting number of max consecutive sequence
        for(int key : keys){
            if(map.get(key) == true){// if key is starting of a sequence
                int start = key;
                int count = 0;
                while(map.containsKey(start+count)){// find the count of sequence, if it is greater than max count, then update max count
                    count++;
                }
                if(count > max_length){
                    max_length = count;
                    starting_num = start;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < max_length; i++){
            al.add(starting_num + i);
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[] = {2, 12, 4, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        System.out.print(Sequence(arr));
    }
}
