class MyClass{
    private int privateVariable;

    public MyClass(int value) {
        this.privateVariable = value;
    }

    public void printValue() {
        System.out.println("Private Variable Value: " + this.privateVariable);
    }
}

public class Q1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        obj.printValue();
    }
}
