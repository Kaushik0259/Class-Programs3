package com.lab7;

import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string to concatenate: ");
        String secondString = scanner.nextLine();

        // Concatenate the second string to the end of the first string
        String concatenatedString = firstString.concat(secondString);

        System.out.println("Concatenated string: " + concatenatedString);

        scanner.close();
    }
}
