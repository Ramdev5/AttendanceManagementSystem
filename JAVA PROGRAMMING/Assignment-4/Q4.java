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

public class Q4 {
    public static void main(String[] args) {
        
        new Student() {{
            initialize("John Doe", 12345);
            display();
        }};
    }
}
