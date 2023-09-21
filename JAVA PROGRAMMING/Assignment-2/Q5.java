import java.util.*;
public class Q5{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int temp=0;
  
  temp=b;
  b=a;
  a=temp; 

  System.out.println("The value of a after swapping is: "+a);
  System.out.println("The value of b after swappping is: "+b);
  }
}