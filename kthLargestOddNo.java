import java.util.Scanner;

public class kthLargestOddNo {
    public static void main(String[] args) {
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the leftmost number");
        int L = sc.nextInt();
        System.out.println("Enter the rightmost number");
        int R = sc.nextInt();
        System.out.println("Enter the Kth largest odd number to be found");
        int k = sc.nextInt();
        int num = 0;
        if(((Math.abs(L) + R)/2 + 1 >= k)){
            if((R % 2) != 0){
                num = R - 2*(k-1);
            } else{
                num = R - 2*(k-1) - 1;
            }
        }
        System.out.println("The " + k + " th largest odd number in the range " + L + " to " + R + " is : " + num);
        sc.close();
    }
}
