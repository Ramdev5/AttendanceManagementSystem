class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name,int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;

    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String add){
        this.address=add;
    }


}
public class Main{
    public static void main(String[] args){
        Person person1=new Person("Anupam",23,"vadodara");
        Person person2=new Person("vinita",34,"mumbai");

        System.out.println("Person 1 information:");
        System.out.println("Name of the person:"+person1.getName());
        System.out.println("Age of the person:"+person1.getAge());
        System.out.println("Address of the person:"+person1.getAddress());
        person1.setAddress("surat");
        System.out.println("person 1 updated information:");
        System.out.println("Updated address of the person:"+person1.getAddress());

        System.out.println();

        System.out.println("person 2 information:");
        System.out.println("Name of the person:"+person2.getName());
        System.out.println("Age of the person:"+person2.getAge());
        System.out.println("Address of the person:"+person2.getAddress());
    }
}
