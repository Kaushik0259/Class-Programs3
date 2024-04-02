package com.lab7;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character sequence to compare: ");
        String characterSequence = scanner.nextLine();

        boolean isEqual = inputString.equals(characterSequence);

        if (isEqual) {
            System.out.println("The string is equal to the specified character sequence.");
        } else {
            System.out.println("The string is not equal to the specified character sequence.");
        }

        scanner.close();
    }
}
