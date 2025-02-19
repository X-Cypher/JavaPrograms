// Enter cost of 3 items from the user(using float data type)-a pencil,a pen and an eraser. 
// You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the cost of pencil");
    float a = sc.nextFloat();
    System.out.println("Enter the cost of pen");
    float b = sc.nextFloat();
    System.out.println("Enter the cost of eraser");
    float c = sc.nextFloat();
    float d = a + 0.18f*a;
    float e = b + 0.18f*b;
    float f = c + 0.18f*c;
    float sum = d+e+f;
    System.out.println("The total cost of items + GST = " + sum);
    sc.close();
    }
}
