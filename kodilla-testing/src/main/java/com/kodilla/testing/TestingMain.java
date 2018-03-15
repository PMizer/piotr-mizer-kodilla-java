package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int addTest = calculator.add(5,3);
        int substractTest = calculator.subtract(10,5);

        if(addTest== (5+3)){
            System.out.println("Test dodawania  w porzadku");
        }
        else{
            System.out.print("Error w dodawaniu.");
        }

        if(substractTest== (10-5)){
            System.out.println("Test odejmowania  w porzadku");
        }
        else{
            System.out.print("Error w odejmowaniu.");
        }
    }
}