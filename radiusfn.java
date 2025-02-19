import java.util.*;
public class radiusfn {
    public static double circumference(int r){
       double c = 2 * 3.14 * r;
       return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("The circumference of the circle is : " + circumference(r));
        sc.close();
    }
}
