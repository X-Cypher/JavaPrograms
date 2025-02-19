import java.util.Scanner;

public class palindrome {
    // Function
    public static void check(int n) {
        int rev = 0;
        int temp = n;
        while(temp>0){
        int rem = temp % 10;
        rev = rev*10 + rem;
        temp/=10;
        }
        if(rev == n){
            System.out.println("The number is a Palindrome");
        }
        else{
            System.out.println("The number is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        check(x);
        sc.close();
    }
}
