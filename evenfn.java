import java.util.*;
public class evenfn {
    public static boolean evenOrNot(int n){
        if (n == 0){
            return false;
        }
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Is the number even? " + evenOrNot(n));
        sc.close();
    }
}
