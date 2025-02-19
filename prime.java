import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = 0;
        for(int i = 2; i<Math.sqrt(n) ; i++){
        if (n%i == 0){
            num += 1;
            }
        }
        if(num == 0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
         sc.close();
    }
}
