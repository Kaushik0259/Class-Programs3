package com.lab6;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulate an operation that might throw an exception
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }
    }

    public static int divideByZero() {
        // Attempting to divide by zero will throw an ArithmeticException
        return 10 / 0;
    }
}

