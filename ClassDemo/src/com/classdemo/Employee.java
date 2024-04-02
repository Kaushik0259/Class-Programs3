package com.classdemo;

import java.util.Scanner;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Method to update salary
    public void updateSalary(double newSalary) {
        salary = newSalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter job title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter current salary: ");
        double salary = scanner.nextDouble();

        // Create employee object
        Employee employee = new Employee(name, jobTitle, salary);

        // Display employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: " + employee.getSalary());

        // Calculate and display annual salary
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Annual Salary: " + annualSalary);

        // Update salary
        System.out.print("\nEnter new salary: ");
        double newSalary = scanner.nextDouble();
        employee.updateSalary(newSalary);

        // Display updated salary
        System.out.println("\nEmployee Details after Salary Update:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Updated Salary: " + employee.getSalary());

        scanner.close();
    }
}
