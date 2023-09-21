public class StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = calculateLength(str);
        
        System.out.println("Length of the string: " + length);
    }
    
    static int calculateLength(String str) {
        int count = 0;
        char[] chars = str.toCharArray(); // Convert string to char array
        
        // Loop until a null terminator is encountered
        while (count < chars.length && chars[count] != '\0') {
            count++;
        }
        
        return count;
    }
}
