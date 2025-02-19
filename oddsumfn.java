import java.util.*;
public class oddsumfn {
    public static int oddSum(int n){
        if (n <= 0){
            System.out.println("Invalid Input");
        }
        int sum = 1;
        for (int i = 2; i <= n; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of all odd numbers from 1 to " + n + " is " +oddSum(n));
        sc.close();
    }
}
