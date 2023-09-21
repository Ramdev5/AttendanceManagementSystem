class Circle {
    double radius;
    
    public void initializeRadius(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.initializeRadius(3.0); // Set the radius to 3.0
        
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();
        
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
    }
}
