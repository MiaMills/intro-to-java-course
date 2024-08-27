package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
      double numberOne = 10.55;
      double numberTwo = 20.03;
   return numberOne + numberTwo; // Print 30.58
System.out.println(numberOne + number2);}

    public static double subtract(double operand1, double operand2) {
       return numberTwo - numberOne;
       System.out.println(numberTwo - numberOne); //Prints 211.34
    }

    public static double multiply(double operand1, double operand2) {
      return numberTwo * numberOne;
      System.out.println(numberTwo * numberOne); // Print 
    }

    public static Boolean areEqual(double operand1, double operand2) {
       return numberTwo == numberOne;
       System.out.println("False"); // Prints false as numbers are dissimilar.
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        return numberTwo < numberOne;
        System.out.println("False"); // Prints false since numberTwo is greater than numberOne.
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return numberTwo > numberOne;
        System.out.println("True"); // Prints true since numberTwo is greater than numberOne.
    }
}
