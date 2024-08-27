The goal of this exercise is to:

create a simple Java project
create a Java package
create and run a simple Java program that prints Hello World! to the screen.
Setup
Inside the exercises/getting-started directory:

create a sub-directory called com
inside the com directory, create a sub-directory called cbfacademy
Inside that last sub-directory (cbfacademy), create a file called HelloWorld.java.

At this point, our directory structure looks as follows:getting-started/com/cbfacademy/HelloWorld.java
Hello World
Open the HelloWorld.java file in your code editor, type the following Java code, then save your changes.

package com.cbfacademy;

public class HelloWorld {
    public static void main(String... args) {
        System.out.println("Hello World!");
    }
}
⌛ Compile

In your terminal, navigate to the getting-started directory.

Execute this command to compile our Java program

javac com/cbfacademy/HelloWorld.java
A HelloWorld.class file is now created alongside our Java source
getting-started/com/cbfacademy/HelloWorld.java/HelloWorld.class

🏃 Run

To run our Java program, let's execute the following command in the same directory as before (getting-started)

java com.cbfacademy.HelloWorld
🎉 Our program prints the following on your screen.

Hello World!