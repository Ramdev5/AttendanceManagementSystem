public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("Hello, ");
        stringBuilder.append("World!");
        
        String result = stringBuilder.toString();
        
        System.out.println(result);
    }
}
