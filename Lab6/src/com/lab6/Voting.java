package com.lab6;

import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException() {
        super("You are under 18 and not eligible for voting");
    }
}

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            if (age < 18) {
                throw new UnderAgeException();
            } else {
                System.out.println("You are eligible for voting!");
            }
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter a valid age (a number).");
        } finally {
            scanner.close();
        }
    }
}
