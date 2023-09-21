class Employee {
    int id;
    String name;
    double salary;
    
    public void initialize(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.initialize(101, "John Doe");
        employee1.setSalary(50000.0);
        
        Employee employee2 = new Employee();
        employee2.initialize(102, "Jane Smith");
        employee2.setSalary(60000.0);
        
        Employee employee3 = new Employee();
        employee3.initialize(103, "Bob Johnson");
        employee3.setSalary(55000.0);
        
        System.out.println("Employee 1:");
        employee1.display();
        
        System.out.println("\nEmployee 2:");
        employee2.display();
        
        System.out.println("\nEmployee 3:");
        employee3.display();
    }
}
