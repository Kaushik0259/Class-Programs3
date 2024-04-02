package com.classdemo;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(width, height);

        // Calculating and printing the area
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        // Calculating and printing the perimeter
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}
