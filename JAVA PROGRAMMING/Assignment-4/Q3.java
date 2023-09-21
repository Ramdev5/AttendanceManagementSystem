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
public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("John Doe", 12345);
        
        
        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("ID: " + student1.id);
        
        
        Student student2 = new Student("Jane Smith", 67890);
        
        
        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("ID:"+ student2.id);
    }
}
