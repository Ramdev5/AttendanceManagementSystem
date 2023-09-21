interface vehicle1{
    
    void printwheels();
}

interface vehicle2{
    void printspeed();
}

class Bike implements vehicle1, vehicle2{
    
    int wheels;
    int speed;
    
    public Bike(int wheels,int speed){
        this.wheels=wheels;
        this.speed=speed;
    }
    
    public void printwheels(){
        System.out.println("no of wheels here is:"+ wheels);
    }
    public void printspeed(){
        System.out.println("The speed of the vehicle is :" +speed);
    }
}
public class Main{
    public static void main(String[] args){
        
        Bike bike=new Bike(4,120);
        
        bike.printwheels();
        bike.printspeed();
    }
}