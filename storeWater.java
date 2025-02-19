import java.util.ArrayList;

public class storeWater {
    public static int Water(ArrayList<Integer>heights) {
        int lp = 0; //left pointer
        int rp = heights.size()-1; //right pointer
        int maxWater = 0;
        while(lp != rp){ //index
            int height = Math.min(heights.get(lp), heights.get(rp));
            int width = rp-lp;
            int currentWater = height*width;
            maxWater = Math.max(maxWater, currentWater);
            if(heights.get(lp) < heights.get(rp)){ //values
                lp++;
            } else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        System.out.println(Water(heights));
    }
}
