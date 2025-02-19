public class bubbleSort {
    public static void bubble(int arr[]){
        for(int i = 0; i < arr.length-1; i++){ //This loop is for the no. of turns 
            for(int j = 0; j < arr.length-1-i; j++){ 
// we do arr.length-1-i because after each turn, the last element is sorted and we dont need to check it
                if(arr[j] > arr[j+1]){
                //    Swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            }
        }
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        bubble(arr);
        System.out.print("The sorted array is : ");
        printArray(arr);
    }
}
