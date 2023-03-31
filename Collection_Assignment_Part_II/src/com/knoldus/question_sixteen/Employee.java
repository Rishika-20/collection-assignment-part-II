package com.knoldus.question_sixteen;

import java.util.*;

public class Employee implements Comparable<Employee> {

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.id, employee.id);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        int numEmployees = 0;
        Employee[] employees = new Employee[numEmployees];
       try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        numEmployees = scanner.nextInt();
        employees = new Employee[numEmployees];

        for (int index = 0; index < numEmployees; index++) {
            System.out.printf("Enter name for employee %d: ", index + 1);
            String name = scanner.next();
            System.out.printf("Enter id for employee %d: ", index + 1);
            int id = scanner.nextInt();
            System.out.printf("Enter salary for employee %d: ", index + 1);
            double salary = scanner.nextDouble();
            employees[index] = new Employee(name, id, salary);
        }
       }catch(InputMismatchException exception){
           System.out.println("Invalid input.");
       }
        Arrays.sort(employees);

        System.out.println("Employees sorted by id:");
        for (Employee employee : employees) {
            System.out.printf("Name: %s, Id: %d, Salary: %.2f%n", employee.getName(), employee.getId(), employee.getSalary());
        }
    }
}

