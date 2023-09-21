
interface Shape {
    double getArea();
}

interface Color {
    String getColor();
}


class Circle implements Shape, Color {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Color: " + circle.getColor());
    }
}
