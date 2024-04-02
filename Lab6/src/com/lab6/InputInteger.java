package com.lab6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch: Please enter an integer.");
            // Clearing the input buffer to avoid infinite loop
            scanner.next();
        } finally {
            scanner.close();
        }
    }
}
