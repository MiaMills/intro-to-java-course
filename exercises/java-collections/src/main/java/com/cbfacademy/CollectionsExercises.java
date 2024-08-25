package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {

        // Create an empty linked list
LinkedList<Integer> integersList = new LinkedList<>();

        //  Add 4 as the first element of the list
integersList.add(4);

        //  Add 5, 6, 8, 2, 9 to the list
integersList.add(5);
integersList.add(6);
integersList.add(8);
integersList.add(2);
integersList.add(9);

        //  Add another 2 as the last element of the list
integersList.addLast(2);

        //  Add 4 as the 3rd element of the list
integersList.add(2,4); 

        //  Invoke the method element() on the list and print the result on the screen
System.out.println(integersList.element());

        //  Return the list
return integersList; 

    }

    public Stack<Integer> useStack() {
        // Create an empty stack
Stack<Integer> integerStack = new Stack<>();

        //  Add 5, 6, 8, 9 to the stack
integerStack.add(5);
integerStack.add(6);
integerStack.add(8);
integerStack.add(9);

        //  Print the first element of the stack on the screen
System.out.print(integerStack.firstElement());

        //  Print the last element of the stack on the screen
        System.out.print(integerStack.lastElement());

        //  Invoke the method pop() on the stack and print the result on the screen
System.out.print(integerStack.pop());

        //  Invoke the push(4) method on the stack
integerStack.push(4);

        //  Return the stack
return integerStack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // Create an empty arrayDeque
ArrayDeque<Integer> arrayDequeIntegers = new ArrayDeque<Integer>() {
    
}; 
        //  Add 5, 6, 8, 9 to the queue
arrayDequeIntegers.add(5);
arrayDequeIntegers.add(6);
arrayDequeIntegers.add(8);
arrayDequeIntegers.add(9);

        //  Print the first element of the queue on the screen
System.out.print(arrayDequeIntegers.getFirst());

        //  Print the last element of the queue on the screen
        System.out.print(arrayDequeIntegers.getLast());

        //  Invoke the method poll() on the queue and print the result on the screen
System.out.print(arrayDequeIntegers.poll());

        //  Invoke the element() method on the queue and print the result on the screen
        System.out.print(arrayDequeIntegers.element());

        //  - return the queue
return arrayDequeIntegers;

    }

    public HashMap<Integer, String> useHashMap() {
        // Create an empty hash map
HashMap<Integer, String> hashLangs = new HashMap<>();

        //  Add {1, TypeScript} entry to the map
hashLangs.put(1, "TypeScript");

        //  Add {2, Kotlin} entry to the map
        hashLangs.put(2, "Kotlin");

        //  Add {3, Python} entry to the map
        hashLangs.put(3, "Python");

        //  Add {4, Java} entry to the map
        hashLangs.put(4, "Java");

        //  Add {5, JavaScript} entry to the map
        hashLangs.put(5, "JavaScript");

        //  Add {6, Rust} entry to the map
        hashLangs.put(6, "Rust");

        //  Determine the set of keys from the map and print it on the screen
System.out.print(hashLangs.keySet());

        //  Determine the set of values from the map and print it on the screen
        System.out.print(hashLangs.values());

        //  Determine whether the map contains "English" as a language and print the result on the screen
   System.out.print(hashLangs.containsValue("English"));

        //  Return the map
return hashLangs;

    }

    public String getName() {
        return "Collections Exercises";
    }
}

