class Shape {
    double area;

    // Constructor for calculating the area of a Rectangle
    public Shape(double length, double width) {
        area = length * width;
    }

    // Constructor for calculating the area of a Square
    public Shape(double sideLength) {
        area = sideLength * sideLength;
    }

    // Constructor for calculating the area of a Triangle
    public Shape(double base, double height, boolean isTriangle) {
        area = 0.5 * base * height;
    }

    // Constructor for calculating the area of a Circle
    public Shape(double radius, String circle) {
        area = Math.PI * radius * radius;
    }

    public double getArea() {
        return area;
    }
}

public class Q10{
    public static void main(String[] args) {
        Shape rectangle = new Shape(5.0, 3.0); // Rectangle
        Shape square = new Shape(4.0);        // Square
        Shape triangle = new Shape(6.0, 8.0, true); // Triangle
        Shape circle = new Shape(2.0, "circle");   // Circle

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
