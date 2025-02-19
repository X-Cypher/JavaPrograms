// Prefix Array Method
public class arraySubArraySum2 {
    public static void maxSubArray(int num[]){
        int sum = 0;
        int max =Integer.MIN_VALUE; // max = -infinity
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }
        for(int i=0; i < num.length; i++){
            for(int j=i; j < num.length; j++){
                if(i == 0){
                    sum = prefix[j];
                } else{
                    sum = prefix[j] + prefix[i-1];
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
        int num[] = {2,4,6,-3,-1,2};
        maxSubArray(num);
    }
}
