abstract class Employee {
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary(); 

    public String getName() {
        return name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }
}

class Contractor extends Employee {
    private int workingHours;

    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Contractor contractor = new Contractor("John", 15, 40);
        int salary = contractor.calculateSalary();

        System.out.println("Contractor Information:");
        System.out.println("Name: " + contractor.getName());
        System.out.println("Payment per Hour: $" + contractor.getPaymentPerHour());
        System.out.println("Working Hours: " + contractor.getWorkingHours());
        System.out.println("Salary: $" + salary);
    }
}
