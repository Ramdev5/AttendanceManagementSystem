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
    public class Q1{
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 12345);
        student1.display();
    }
}
}