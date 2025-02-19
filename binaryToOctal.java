public class binaryToOctal {

    public static int binaryToDecimal(int num){
        int ans = 0;
        int i = 0;
        while(num > 0){
            int digit = num % 10;
            num /= 10;
            ans += (digit * Math.pow(2, i));
            i++;
        }
        return ans;
    }
    
    public static void binaryOctal(int num){
        int ans = 0;
        int mul = 1;
        while (num > 0) {
            int curr = num % 1000;
            int decimal = binaryToDecimal(curr);
            ans = ans + decimal * mul;
            num /= 1000;
            mul *= 10;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int n = 1100110;
        binaryOctal(n);
    }   
}
