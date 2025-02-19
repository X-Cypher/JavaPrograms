import java.util.*;
public class greaterfn {
    public static void greaterNumber(int a, int b){
        if (a > b){
            System.out.println(a + " is greater than " + b);
        }
        else if(a < b){
            System.out.println(b + " is greater than " + a);
        }else {
            System.out.println("both are equal");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNumber(a, b);
        sc.close();
    }
}
