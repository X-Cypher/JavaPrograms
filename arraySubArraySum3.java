// Kadane's Algorithm says make the sum = 0 if it gets NEGATIVE
public class arraySubArraySum3 {
    public static void subArraySum(int num[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        if(max == 0){ //case for all negative array
            for(int i = 1; i < num.length; i++){
                max = Math.max(num[i-1], num[i]);
            }
        }
        System.out.println("The max sum of subArray is: " + max);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        subArraySum(num);
        int number[] ={-3,-3,-4,-1};
        subArraySum(number);
    }
}
