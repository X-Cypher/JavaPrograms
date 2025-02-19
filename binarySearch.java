// Binary search works on sorted array
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {2,4,6,8,10,12,14,16,18,20};
        System.out.println("Enter the number to be searched");
        int n = sc.nextInt();
        int start = 0;
        int end = num.length-1;
        while (start <= end) {
            int mid = (start+end)/2; //start + (end - start)/2;
            if(num[mid] == n){
                System.out.println("Number found at index: " + mid);
                System.exit(0);
            }
            if (num[mid] > n) { //number will be in left part of array
                end = mid-1;
            } else{
                start = mid+1;    //number will be in right part of array
            }
        }
        System.out.println("Number not found at any index");
        sc.close(); 
    }
}
