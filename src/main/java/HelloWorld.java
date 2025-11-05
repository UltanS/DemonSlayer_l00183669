package main.java;

/*
    Name: HelloWorld.java
    Student ID: l00183669
    Description: A simple Java Program, this program tests the pipeline setup.
*/
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Instance variables
        Scanner keyIn = new Scanner(System.in);
        String user_name;

        // Get users name
        System.out.print("Enter your name: ");
        user_name = keyIn.nextLine();

        // Print Hello to the user
        System.out.println("Hello " + user_name + "! Hope you are having a great day!");

        // Close the scanner
        keyIn.close();
    }
}
