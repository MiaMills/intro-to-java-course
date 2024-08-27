package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public String fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<String> result = new ArrayList<>();
        for (int number : numbers) {

               //  - if the ${element} is divisible by both 3 and 5, “FizzBuzz”listed/ printed
      if (number % 3 == 0 && number % 5 == 0) {
            System.out.print("FizzBuzz");
        }
        
        //  - if the ${element} is divisible by 3, "Fizz" is listed/ printed
        else if (number % 3 == 0 ) {
            System.out.print("Fizz");
        }
        //  - if the ${element} is divisible by 5, "Buzz" is listed/ printed

        else if (number % 5 == 0) {
            System.out.print("Buzz");
}
else{
    System.out.println("number");
}

        //  - it returns the constructed list
return ("result");

    }
}

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        List<String> monthStrings = List.of("January" , "February", "March" , "April", 
        "May", "June", "July", "August", "September", "October", "November", "December");
        
        if(number >= 0 && number <= 11){

            String[] month;
            return month[number -1]; 
        }
        //  - if the ${number} is invalid, the method should return "Invalid month number"
else{

    return "Invalid month number";
}

    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of integers 100 numbers - from 1 to 100
       List<Integer> integerList = new ArrayList<>();
       for (int i = 1; i <= 100; i++) {
       System.out.println(integerList.size()); //  Prints the size of the list- 100
       integerList.add(i);  
       }

        //  - determines the sum of all the even numbers in the list
        int sumOfEvens = 0; // Initialise varibales which stores sum of even numbers from 2 to 100
        int sumOfOdds = 0; // Initialise varibales which stores sum of odd numbers from 1 to 99

        for (int i = 1; i <= 100; i +=2) {
            sumOfEvens += i;  // Adds current even number to the varibale 'sumOfEvens' from 2 to 100
        }
        {
        //  - determines the sum of all the odd numbers in the list
        for (int i = 0; i <= 99;) {
            sumOfOdds += i; // Adds current odd number to the varibale 'sumOfEvens' from 1 to 99

        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
       Map<String, Integer> sumOfOddsAndSumOfEvens = new HashMap<>();

        return sumOfOddsAndSumOfEvens;
        }
    }
        }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order

        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
