class Student {
    String name;
    int id;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
public class Q6 {
    public static void main(String[] args) {
        // Creating Student objects and initializing values using constructors
        Student student1 = new Student("John Doe", 12345);
        Student student2 = new Student("Jane Smith", 67890);
        
        // Accessing and displaying the values of the objects
        System.out.println("Student 1:");
        student1.display();
        
        System.out.println("\nStudent 2:");
        student2.display();
    }
}
