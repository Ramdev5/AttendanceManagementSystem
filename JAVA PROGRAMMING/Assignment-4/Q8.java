class Square {
    double sideLength;
    
    public void initializeSide(double sideLength) {
        this.sideLength = sideLength;
    }
    
    public double calculateArea() {
        return sideLength * sideLength;
    }
    
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Square square = new Square();
        square.initializeSide(5.0); // Set the side length to 5.0
        
        double area = square.calculateArea();
        double perimeter = square.calculatePerimeter();
        
        System.out.println("Square Area: " + area);
        System.out.println("Square Perimeter: " + perimeter);
    }
}
