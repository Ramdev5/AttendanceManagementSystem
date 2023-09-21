class Student {
    String name;
    int id;
    static String college = "ABC College";

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College: " + college);
    }

    public static void changeCollege(String newCollege) {
        college = newCollege;
    }
}

public class Q14 {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 12345);
        Student student2 = new Student("Jane Smith", 67890);

        System.out.println("Student 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();

        Student.changeCollege("XYZ University"); // Change the college

        System.out.println("\nAfter changing college:");
        System.out.println("Student 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();
    }
}
