public class arraySubArraySum1 {
    public static void maxSubArray(int num[]){
        int sum = 0;
        int max =Integer.MIN_VALUE; // max = -infinity
        for(int i=0; i < num.length; i++){
            for(int j=i; j < num.length; j++){
                sum = 0;
                for(int k = i; k <= j; k++){
                    sum += num[k];
                }
                System.out.println("Sum = " + sum);
                if (sum > max){
                    max = sum;
                }                
            }
        }
        System.out.println("The max sum of subArray is: " + max);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8};
        maxSubArray(num);
    }
}
