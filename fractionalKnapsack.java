import java.util.*;
public class fractionalKnapsack {
    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;
        double ratio[][] = new double[value.length][2]; //3 rows 2 columns: one col. for storing index, one for storing ratio
        for(int i = 0; i < value.length; i++){
            ratio[i][0] = i; //index
            ratio[i][1] = value[i]/(double)weight[i]; //ratio
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //sort according to the 2nd column in ascending order
        //we want to be greedy so we pick items in reverse order to obtain Max. profit
        int capacity = W;
        int finalValue = 0;
        for(int i = ratio.length-1; i>=0; i--){
            int index = (int)ratio[i][0];
            //include full value
            if(capacity>=weight[index]){
                capacity-= weight[index];
                finalValue += value[index];
            } else{
                finalValue += (ratio[i][1]*capacity); //fractional value
                break;
            }
        }
        System.out.println("The final value is: " + finalValue );
    }
}
