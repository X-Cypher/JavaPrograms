// This method is for sorted array: upar se neeche jayenge toh ascending & left to right bhi ascending
import java.util.Scanner;
public class array2Dsearch {
    public static void sortedArraySearch(int arr[][], int n) {
        int row = 0, column = arr[0].length-1; //we will start from top right element
        while(row < arr.length && column >= 0){

         // Logic : agar element small hai toh left jao, agar bada hai element fir neeche jao

            if(arr[row][column] == n){
                System.out.println("The number is found at : " + "(" + row + "," + column + ")");
                break;
            } else if(n > arr[row][column]){ //go down
                row++;
            } else{ //go left
                column--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40}, 
                       {15,25,35,45}, 
                       {27,29,37,48}, 
                       {32,33,39,50}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched : ");
        int n = sc.nextInt();
        sortedArraySearch(arr, n);
        sc.close();
    }
}
