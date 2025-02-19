// A leap year is exactly divisible by 4 except for century years (years ending with 00).
//  The century year is a leap year only if it is perfectly divisible by 400.
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = sc.nextInt();
        if(n % 100 == 0){
            if (n % 400 == 0){
                System.out.println("Leap Year");
            }
            else {
                    System.out.println("Not a Leap Year");
            }
        }
        else{
            if(n % 4 == 0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        sc.close();
    }
}
