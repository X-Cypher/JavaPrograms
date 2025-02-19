//given nxm chocolate with cost of horizontal and vertical cut.Cut the chocolate in single squares that min cost is req.
//costly cuts ko pehle karo because after each cut the no. of pieces increases and cost will be multiplied

import java.util.Arrays;
import java.util.Collections;

public class minCostToCut {
    public static void main(String[] args) {
        //4x6 chocolate
        Integer verCost[] = {2,1,3,1,4};
        Integer horCost[] = {4,1,2};
        // sorted in descending order
        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());
        int h=0, v=0, hPieces = 1,vPieces = 1;
        int cost = 0;
        //this while loop will terminate once an array goes out of bounds
        while(h < horCost.length && v < verCost.length){
            if(verCost[v] >= horCost[h]){ //vertical cut
                cost += verCost[v]*hPieces;
                vPieces++;
                v++;
            } else{
                cost += horCost[h]*vPieces;//horizontal cut
                hPieces++;
                h++;
            }
        }
        //for remaining cuts, we have to give separate loops
        while(v < verCost.length){
            cost += verCost[v]*hPieces;
            vPieces++;
            v++;
        }
        while(h < horCost.length){
            cost += horCost[h]*vPieces;
            hPieces++;
            h++;
        }
        System.out.println("The min. cost to cut is : " + cost);
    }
}
