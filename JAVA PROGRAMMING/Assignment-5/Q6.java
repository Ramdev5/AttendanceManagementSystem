class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Car extends Vehicle {
    private int year;

    public Car(String brand, int year) {
        super(brand); // Invoking superclass constructor
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);

        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Year: " + car.getYear());
    }
}
