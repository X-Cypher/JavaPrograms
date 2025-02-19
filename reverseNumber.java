public class reverseNumber {
    public static void main(String[] args) {
        int n = 1100110;
        binaryOctal(n);
    }

    public static void binaryOctal(int num){
        int ans = 0;
        while(num > 0){
            int curr = num % 1000;
            int decimal = binaryToDecimal(curr);
            ans = ans * 10 + decimal;
            curr /= 1000;
        }
        ans = reverse(ans);
        System.out.println(ans);
    }

    public static int reverse(int n){
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = (reverse*10) + rem;
            n /= 10;
        }
        return reverse;
    }

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
}
