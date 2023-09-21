public class Q11 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int scalar = 2;
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] resultMatrix = new int[rows][columns];
        
        // Multiply matrix by scalar
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix[i][j] * scalar;
            }
        }
        
        // Display the result matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        
        System.out.println("\nResult Matrix after Scalar Multiplication:");
        displayMatrix(resultMatrix);
    }
    
    static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
