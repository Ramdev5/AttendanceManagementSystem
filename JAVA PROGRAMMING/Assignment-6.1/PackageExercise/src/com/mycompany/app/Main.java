package com.mycompany.app;

import com.mycompany.math.Calculator;

public class Main {
    public static void main(String[] args){

        Calculator calc=new Calculator();

        int sum=calc.add(10,5);
        System.out.println("Sum:"+sum);

        int minus=calc.subtract(20,7);
        System.out.println("Subtract:"+minus);
    }
}
