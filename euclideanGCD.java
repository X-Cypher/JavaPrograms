
public class euclideanGCD {
    public static void main(String[] args) {
        int num1 = 50, num2 = 32;
        System.out.println(GCD(num1, num2));
    }

    public static int GCD(int a, int b) {
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            } else{
                b = b % a;
            }
        }
        if(a == 0){
            return b;
        } else{
            return a;
        }
    }
}
