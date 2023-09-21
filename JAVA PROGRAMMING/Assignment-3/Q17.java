public class Q17 {
    public static void main(String[] args) {
        String givenName = "John";
        String fullName = givenName + " Doe"; // Concatenate given name with surname
        
        System.out.println("Original String: " + fullName);
        
        givenName = "Jane"; // Modify the given name
        
        System.out.println("Modified String: " + fullName); // Still prints "John Doe"
        System.out.println("New Given Name: " + givenName); // Prints "Jane"
    }
}
