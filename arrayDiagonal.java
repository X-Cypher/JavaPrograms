public class arrayDiagonal {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            // principal diagonal sum
            sum += matrix[i][i]; //condition for diagonal sum : (i=j)
            // secondary diagonal sum
            if(i != matrix.length-1-i){ //condition for secondary sum : (i+j = matrixLength-1)
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,2,4}, {9,2,3,0}, {8,0,2,4}};
        System.out.println(diagonalSum(matrix));
    }
}
