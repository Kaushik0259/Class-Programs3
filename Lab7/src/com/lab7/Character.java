package com.lab7;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter the index
        System.out.print("Enter the index to get the character: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < inputString.length()) {
            // Get the character at the specified index
            char character = inputString.charAt(index);
            System.out.println("Character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index. Please enter an index within the range of the string.");
        }

        scanner.close();
    }
}
