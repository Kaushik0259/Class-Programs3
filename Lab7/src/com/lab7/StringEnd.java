package com.lab7;

import java.util.Scanner;

public class StringEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the string to check for ending: ");
        String endingString = scanner.nextLine();

        // Check if the main string ends with the specified ending string
        boolean endsWith = mainString.endsWith(endingString);

        // Display the result
        if (endsWith) {
            System.out.println("The main string ends with the specified string.");
        } 
        else {
            System.out.println("The main string does not end with the specified string.");
        }

        scanner.close();
    }
}
