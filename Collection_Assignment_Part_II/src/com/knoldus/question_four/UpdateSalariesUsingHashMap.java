package com.knoldus.question_four;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UpdateSalariesUsingHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store employee names and salaries
        HashMap<String, Double> salaries = new HashMap<>();

        // Read employee names and salaries from the console using Scanner
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of employees: ");
            int numEmployees = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numEmployees; i++) {
                System.out.print("Enter the name of employee " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.print("Enter the salary of employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                scanner.nextLine();
                salaries.put(name, salary);
            }
            for (String name : salaries.keySet()) {
                double salary = salaries.get(name);

                if (salary < 50000.0) {

                    // give a 5% raise
                    salary += salary * 0.05;
                    // update the salary in the HashMap
                    salaries.put(name, salary);
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input!!");
        }

        // Print out the updated salaries
        System.out.println("Updated salaries: " + salaries);
    }
}
