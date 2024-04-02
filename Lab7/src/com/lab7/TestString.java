package com.lab7;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the sequence of characters to check: ");
        String sequence = scanner.nextLine();

        boolean containsSequence = inputString.contains(sequence);

        if (containsSequence) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }

        scanner.close();
    }
}
