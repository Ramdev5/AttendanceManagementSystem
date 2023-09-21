class Student {
    String name;
    int id;
    
    public void initialize(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
public class Q5 {
    public static void main(String[] args) {
        // Creating multiple Student objects and initializing their values
        Student student1 = new Student();
        student1.initialize("John Doe", 12345);
        
        Student student2 = new Student();
        student2.initialize("Jane Smith", 67890);
        
        // Accessing and displaying the values of the objects
        System.out.println("Student 1:");
        student1.display();
        
        System.out.println("\nStudent 2:");
        student2.display();
    }
}
