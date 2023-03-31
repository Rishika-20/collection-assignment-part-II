package com.knoldus.first_question;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NameAgeHashMap {
    public static void main(String[] args) {
        // Create an empty HashMap to store name-age pairs
        HashMap<String, Integer> nameAgeMap = new HashMap<>();

        try {// Read name-age pairs from the console using Scanner.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of people: ");
            int numPeople = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numPeople; i++) {
                System.out.print("Enter the name of person " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.print("Enter the age of person " + (i + 1) + ": ");
                int age = scanner.nextInt();
                scanner.nextLine();
                nameAgeMap.put(name, age);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.");
        }
        // Print out the HashMap
        System.out.println("Name-Age HashMap: " + nameAgeMap);
    }
}
