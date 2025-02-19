import java.util.*;
public class tablefn {
    public static int numberTable(int n){
        int k;
        for (int i = 1; i <= 10; i++){
         k = n*i;
            System.out.println(k);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberTable(n);
        sc.close();
    }
}
