// given a sorted and rotated arrayList 
import java.util.ArrayList;
public class pairSum {
    public static boolean Sum(ArrayList<Integer>num, int target){
       int pivot = -1; 
       for(int i = 0; i < num.size();i++){
        if(num.get(i)>num.get(i+1)){
            pivot = i; //find rotation point(pivot)
            break;
            }
        }
        int lp = pivot+1; //left pointer
        int rp = pivot;   //right pointer
        int n = num.size();
        while(lp!=rp){

            if(num.get(lp) + num.get(rp) == target){
            System.out.println("Target found: " + num.get(lp) + " + " + num.get(rp));
            return true;
            }

            if(num.get(lp) + num.get(rp) < target){
                lp = (lp+1) % n; //returns 0 to n-1 (modulo's property)
            } else{              //modular arithmetic
                rp = (rp+n-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>num  = new ArrayList<>();
        num.add(11);
        num.add(12);
        num.add(8);
        num.add(9);
        num.add(10);
        System.out.println(Sum(num, 22));
    }
}    