class Student {
    private String name;
    private int age;

    
    public Student() {
        name = "Unknown";
        age = 0;
    }

    
    public Student(String studentName) {
        name = studentName;
        age = 0;
    }

    
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        Student namedStudent = new Student("Alice");
        Student fullInfoStudent = new Student("Bob", 20);

        System.out.println("Default Student:");
        defaultStudent.displayInfo();

        System.out.println("\nNamed Student:");
        namedStudent.displayInfo();

        System.out.println("\nFull Info Student:");
        fullInfoStudent.displayInfo();
    }
}
