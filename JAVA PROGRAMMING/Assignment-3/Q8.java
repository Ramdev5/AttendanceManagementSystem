public class Q8 {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length]; // Create a new array with the same length
        
        copyArray(sourceArray, destinationArray);
        
        System.out.println("Source Array:");
        printArray(sourceArray);
        
        System.out.println("\nDestination Array:");
        printArray(destinationArray);
    }
    
    static void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
