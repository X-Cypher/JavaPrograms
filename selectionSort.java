public class selectionSort {
    public static void selection(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int small = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(small > arr[j]){
                    small = arr[j];
                }
            }
            // Swap
            int temp = small;
            small = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            }
        }
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        selection(arr);
        System.out.print("The sorted array is : ");
        printArray(arr);
    
    }
}