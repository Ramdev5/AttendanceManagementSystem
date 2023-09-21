interface Employee {
    int getPaymentPerHour();
    int calculateSalary();
}

interface Contractor extends Employee {
    int getWorkingHours();
    int calculateSalary();
}

interface Worker extends Employee {
    int getWorkingHours();
    int calculateSalary();
}

class ConcreteContractor implements Contractor {
    private String name;
    private int paymentPerHour;
    private int workingHours;

    public ConcreteContractor(String name, int paymentPerHour, int workingHours) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

    @Override
    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    @Override
    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
}

class ConcreteWorker implements Worker {
    private String name;
    private int paymentPerHour;
    private int workingHours;

    public ConcreteWorker(String name, int paymentPerHour, int workingHours) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

    @Override
    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    @Override
    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Contractor contractor = new ConcreteContractor("John", 15, 40);
        Worker worker = new ConcreteWorker("Alice", 12, 35);

        System.out.println("Contractor Information:");
        System.out.println("Payment per Hour: $" + contractor.getPaymentPerHour());
        System.out.println("Working Hours: " + contractor.getWorkingHours());
        System.out.println("Salary: $" + contractor.calculateSalary());

        System.out.println("\nWorker Information:");
        System.out.println("Payment per Hour: $" + worker.getPaymentPerHour());
        System.out.println("Working Hours: " + worker.getWorkingHours());
        System.out.println("Salary: $" + worker.calculateSalary());
    }
}
