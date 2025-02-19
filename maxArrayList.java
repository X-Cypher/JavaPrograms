import java.util.ArrayList;
import java.util.Collections;

public class maxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(0);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max= Math.max(max, list.get(i));
        }
        System.out.println("The largest element of ArrayList is: " + max);

    }

}

