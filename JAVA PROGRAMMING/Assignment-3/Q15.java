public class Q15 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = calculateLength(str);
        
        System.out.println("Length of the string: " + length);
    }
    
    static int calculateLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
}
