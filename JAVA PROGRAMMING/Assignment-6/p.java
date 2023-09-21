interface Shape{
    
    double calculateArea();

}

class Circle implements Shape{


     double radius;

    
     public Circle(double radius){
        this.radius=radius;
    }

    public double calculateArea(){

         return 3.14*radius*radius;
    }
}

public class p{
     public static void main(String[] args){
        Circle circle=new Circle(4.9);

         double result=circle.calculateArea();


        
        System.out.println("Radius of the circle is:"+result);
   }
}