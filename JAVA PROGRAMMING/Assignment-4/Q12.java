class Student {
    String name;
    int id;
    static String college;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College: " + college);
    }
}

public class Q12 {
    public static void main(String[] args) {
        // Set the college for all students
        Student.college = "ABC College";

        // Create two Student objects
        Student student1 = new Student("John Doe", 12345);
        Student student2 = new Student("Jane Smith", 67890);

        // Access and display student information
        System.out.println("Student 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();
    }
}
