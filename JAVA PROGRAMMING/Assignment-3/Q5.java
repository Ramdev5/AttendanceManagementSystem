public class Q5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        double sum = 0.0;
        for (int num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.length;
        
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average);
    }
}
