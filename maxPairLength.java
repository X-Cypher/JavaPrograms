// given n pair of numbers (a,b) where a<b and a pair (c,d) can come after pair (a,b) if b<c
//find the longest chain that can be formed
import java.util.*;
public class maxPairLength {
    public static void main(String[] args) {
        int pairs [][] = {{5,24}, {39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, (a,b) -> Integer.compare(a[1], b[1]));
        int chainEnd = pairs[0][1];
        int length = 1;
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainEnd = pairs[i][1];
                length++;
            }
        }
        System.out.println("The longest chain that can be formed : " + length);
    }
}
