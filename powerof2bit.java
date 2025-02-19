import java.util.*;
public class powerof2bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a power of 2 or not");
        int n = sc.nextInt();
        sc.close();
        
        //wrong code
        if ((n & 1) == 0){
            System.out.println("The given number is a power of 2");
        }
        else {System.out.println("The given number is not a power of 2");
        }
    }
}