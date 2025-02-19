import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int j = 1;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= i; k++){
                System.out.print(j +" ");
                j++;
            }
            System.out.println();
        }
        sc.close();
    }
}
