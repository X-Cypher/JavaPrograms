// place N-Queens in a NxN chess board in such a way that they are safe from each other
import java.util.*;
public class nQueens {
    public static boolean isSafe(char chess[][], int row, int col){
        // check vertically up
        for(int i = row-1; i>=0; i--){
            if(chess[i][col] == 'Q'){
                return false;
            }
        }
        // check left up diagonal
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }
        // check right up diagonal
        for(int i = row-1, j = col+1; i>=0 && j < chess.length; i--, j++){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void Queens(char chess[][], int row){
        if(row == chess.length){
            printBoard(chess);
            return;
        }
        for(int j = 0; j < chess.length; j++){ //check every column of curr row
            if(isSafe(chess, row, j)){
                chess[row][j] = 'Q'; //put
                Queens(chess, row+1);//explore further
                chess[row][j] = 'x';//backtracking
            }
        }
    }
    public static void printBoard(char chess[][]){
        System.out.println("-------------------");
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j<chess.length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char chess[][] = new char[n][n];
        for(int i = 0; i < chess.length; i++){
            Arrays.fill(chess[i], 'x');
        }
        Queens(chess, 0);
    }
}