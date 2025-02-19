import java.util.*;
public class matrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();

        int matrix[][] = new int [row][col];
        System.out.println("Enter the matrix elements");

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //for transpose 
        for (int j = 0; j < col; j++){
            for (int i = 0; i < row; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
