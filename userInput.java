import java.util.*;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0; int n = 0; int z = 0;
        char c;
        do{
            System.out.println("Enter a number : ");
            int num = sc.nextInt();

            if (num > 0) {
                p++;
            }
            else if ( num < 0){
                n++;
            }
            else {
                z++;
            }
            System.out.println("Do you want to continue? y/n ");
            c = sc.next().charAt(0);
        } while (c == 'y');
        System.out.println("The number of positive numbers entered is : "+ p);
        System.out.println("The number of negative numbers entered is : "+ n);
        System.out.println("The number of zeroes entered is : "+ z);
        sc.close();
    }   
}
