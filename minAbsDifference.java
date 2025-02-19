import java.util.*;
public class minAbsDifference {
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};
        // to find min sum of absolute differences we need to pair small with small & large with large
        // so we sort the arrays
        Arrays.sort(A);
        Arrays.sort(B);
        int finalSum = 0;
        for(int i = 0; i < A.length; i++){
            finalSum += Math.abs(A[i] - B[i]);
        }
        System.out.println("The minimum absolute sum of the pairs is : "+ finalSum);
    }    //O(nlogn); log n because sorting takes logn time
}
