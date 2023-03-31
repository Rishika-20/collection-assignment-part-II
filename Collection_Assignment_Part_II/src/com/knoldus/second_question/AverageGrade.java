package com.knoldus.second_question;
import java.util.HashMap;
import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {

        // Create a HashMap to store student names and their grades
        HashMap<String, Double> grades = new HashMap<>();

        // Read student names and grades from the console using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        // To store the details of total number Of students.
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            grades.put(name, grade);
        }
        // Calculate the average grade
        double sum = 0.0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        double average = sum / grades.size();

        // Print out the average grade
        System.out.println("The average grade is: " + average);
    }
}

