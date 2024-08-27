package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
    
        String firstWord = "Hello";
        String secondWord = "World";
        String thirdWord = "Greeting!";

       return firstWord + " " + secondWord + " " + thirdWord;    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
      
        String firstword = "Hello";
        String secondWord = "World";

       return firstWord.equals(secondWord); // Returns false because words are dissimilar.
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
       
        String itemName = "Mangoes";
        double Price = "3";
        int quantityOfItem = 10;
        
        double totalBill = Price * quantityOfItem;
        
       return totalBill; // Prints £30.
    }
}
