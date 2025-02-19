import java.util.*;
public class hollowbutterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        sc.close();
        for (i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 
            }
            // Spaces
            for (int j = 1; j <= 2*(n-i) ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                if (j ==1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // For mirror image = outer loop is reversed
        for (i = n; i >=1; i--){
            for (int j = 1; j <= i; j++){
                if (j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 
                }
            for (int j = 1; j <= 2*(n-i); j++){
                    System.out.print(" ");
                }
            for (int j = 1; j <= i; j++){
                if ( j == i || j == 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }           
            System.out.println();
        }  
    }
}