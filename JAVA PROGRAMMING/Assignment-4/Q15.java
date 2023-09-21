class Triangle {
    static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Q15 {
    public static void main(String[] args) {
        double base = 6.0;
        double height = 8.0;

        double area = Triangle.calculateArea(base, height);

        System.out.println("Area of Triangle: " + area);
    }
}
