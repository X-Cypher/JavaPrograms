import java.util.*;
public class calculator {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the 1st number");
         float a = sc.nextFloat();
         System.out.println("Enter the 2nd number");
         float b = sc.nextFloat();
         System.out.println("Enter 1 for +, 2 for -, 3 for *, 4 for /, 5 for %");
         int operator = sc.nextInt();

             switch (operator) {
             case 1: System.out.println(a+b);
                 break;
             case 2 : System.out.println(a-b);
                 break;
             case 3 : System.out.println(a*b);
                 break;
             case 4 : System.out.println(a/b);
                 break;
             case 5 : System.out.println(a%b);
                 break;
             default:System.out.println("Invalid operator");
                 break;
         } 
              sc.close();
    }
    
}
