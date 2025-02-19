import java.util.*;
public class formattingSoftware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][][] = new int[n][rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < cols; k++){
                    matrix[j][i][k] = sc.nextInt();
                }
            }
        }

        sc.nextLine(); // Consume the newline after the last matrix row
        List<String> instructions = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (!line.trim().isEmpty()) { // Skip empty lines
                instructions.add(line);
            }
        }

        // Step 6: Process each instruction
        for (String instruction : instructions) {
            // Parse the matrix indices from the instruction line
            String[] parts = instruction.split(" ");
            List<Integer> matrixIndices = new ArrayList<>();
            for (String part : parts) {
                matrixIndices.add(Integer.parseInt(part) - 1); // Convert to 0-based index
            }

            // Combine and print rows of specified matrices
            for (int row = 0; row < rows; row++) {
                for (int matrixIndex : matrixIndices) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[matrixIndex][row][col] + " ");
                    }
                }
                System.out.println(); // Move to the next row
            }
        }
    }
}
