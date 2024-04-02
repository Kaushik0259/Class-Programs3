package com.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            readFile("example.txt"); // Change the file name to test different scenarios
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filename);
        }

        try {
            Scanner scanner = new Scanner(file);

            // Read file content
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            // This catch block is not strictly necessary because we already checked if the file exists
            // It's included here for demonstration purposes
            throw e;
        }
    }
}
