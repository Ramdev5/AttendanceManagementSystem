public class Q6 {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array:");
        printArray(integers);
        
        doubleElements(integers);
        
        System.out.println("\nArray after Doubling:");
        printArray(integers);
    }
    
    static void doubleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
