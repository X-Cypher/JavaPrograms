import java.util.Scanner;

public class recursionOccurence {
    public static int firstOccurence(int arr[], int key, int startIndex){
        if(startIndex == arr.length){
            return -1;
        }
        if(arr[startIndex] == key){
            return startIndex;
        }
        return firstOccurence(arr, key, startIndex+1);
    }
    public static int lastOccurence(int arr[], int key, int startIndex){
        if(startIndex == arr.length){
            return -1;
        }
        int found = lastOccurence(arr, key, startIndex + 1);
        if(found != -1){
            return found;
        }
        if(arr[startIndex] == key){
            return startIndex;
        }
        return found;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,9,3,1,0,8,4,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key ");
        int key = sc.nextInt();
        System.out.println("The first occurence is :" + firstOccurence(arr, key, 0));
        System.out.println("The last occurence is :" + lastOccurence(arr, key, 0));
        sc.close();
    }
}
