import java.util.*;
public class arraySpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of rows");
        int n = sc.nextInt();
        System.out.println("Input number of columns");
        int m = sc.nextInt();

        int array [][] = new int [n][m];
        System.out.println("Enter the array elements");

        //outer loop for rows ; inner loop for columns
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int row_start = 0; int row_end = n-1; int column_start = 0; int column_end = m-1;
        System.out.println("The spiral order output of the array is");

        while (row_start <= row_end && column_start <= column_end) {
            // top
            for (int j = column_start; j <= column_end; j++){
                System.out.print(array[row_start][j] + " ");
            }
            row_start++;
            // right
            for (int i = row_start; i <= row_end; i++){
                System.out.print(array[i][column_end] + " ");
            }
            column_end--;
            // bottom
            if(row_start <= row_end){
             for (int j = column_end; j >= column_start; j--){                
                 System.out.print(array[row_end][j] + " ");
             }
            row_end--;
            }
            // left
            if(column_start <= column_end){
             for (int i = row_end; i >= row_start; i--){
                 System.out.print(array[i][column_start] + " ");
             }
            column_start++;
            }        
        }
    }
}
