import java.util.Scanner;
// This method's time complexity is O(log n)
public class recursionPower {
    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = Power(x, n/2);{
        int fullPower = halfPower*halfPower;
        // for odd : x*x^(n/2)*x^(n/2)   
        if(n%2 != 0){
            fullPower *= x; //fullPower = x*fullPower
        }
        return fullPower;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        System.out.println("Enter the power ");
        int n = sc.nextInt();
        System.out.println(Power(x,n));
        sc.close();
    }
}
