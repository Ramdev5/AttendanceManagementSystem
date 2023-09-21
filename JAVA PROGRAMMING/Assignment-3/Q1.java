public class Q1 {
    public static void main(String[] args) {
        // Using Array Initialization
        int[] numbers1 = {1, 2, 3, 4, 5};
        
        // Using the new Keyword
        int[] numbers2 = new int[5]; // Creates an array of length 5
        
        // Creating and Initializing Later
        int[] numbers3 = new int[5];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        numbers3[3] = 4;
        numbers3[4] = 5;
        
        // Using an Anonymous Array
        int[] numbers4 = new int[]{1, 2, 3, 4, 5};
        
        // Using a Loop
        int length = 5;
        int[] numbers5 = new int[length];
        for (int i = 0; i < length; i++) {
            numbers5[i] = i + 1;
        }
        
        // Print the arrays for verification
        printArray(numbers1);
        printArray(numbers2);
        printArray(numbers3);
        printArray(numbers4);
        printArray(numbers5);
    }
    
    // Helper method to print an array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
