public class Q7 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        int sum = calculateSum(numbers);
        
        System.out.println("Sum of Array Elements: " + sum);
    }
    
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
