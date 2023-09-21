public class Q9 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        
        int[][] matrix = new int[rows][columns];
        
        // Initialize the matrix with values
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = value;
                value++;
            }
        }
        
        // Display the matrix elements
        System.out.println("Matrix Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
