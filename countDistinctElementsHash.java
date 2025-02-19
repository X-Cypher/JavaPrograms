import java.util.HashSet;

public class countDistinctElementsHash {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set.size());
    }
}
