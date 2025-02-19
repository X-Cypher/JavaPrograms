import java.util.*;

public class averagefn {
    public static double average(int a, int b, int c){
    double avg = (a+b+c)/3.0;
    return avg;}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    System.out.println("The average of the given numbers is : " + average(x, y, z));
    sc.close();
    }
}
