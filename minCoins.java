import java.util.Arrays;
import java.util.Comparator;

public class minCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};//used Integer instead of int because Integer can be sorted by 
        //using Comparator
        Arrays.sort(coins, Comparator.reverseOrder());//descending order
        int value = 1221;
        int count = 0;
        for(int i=0; i<coins.length; i++){
            if(value>=coins[i]){
                while(value>=coins[i]){
                    value-=coins[i];
                    count++;
                }
            }
        }
        System.out.println("The minimum number of coins : " + count);
    }
}
