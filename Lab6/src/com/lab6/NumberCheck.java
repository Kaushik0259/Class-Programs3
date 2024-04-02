package com.lab6;

class OddNumberException extends Exception {
    public OddNumberException() {
        super("Odd number exception: Number cannot be odd");
    }
}

public class NumberCheck {
    public static void main(String[] args) {
        try {
            int number = 1; // Change the number to test different scenarios
            checkEvenNumber(number);
            System.out.println(number + " is even.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException();
        }
    }
}
