package com.knoldus.question_nine;

import java.util.*;

public class SortingALinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<CustomObject> list = new LinkedList<>();
        System.out.println("Enter the number of custom objects: ");

        try {
            // Reading input from scanner and adding CustomObjects to LinkedList
            int numbers = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            for (int index = 0; index < numbers; index++) {
                System.out.println("Enter name for object " + (index + 1) + ": ");
                String name = scanner.nextLine();
                CustomObject obj = new CustomObject(name);
                list.add(obj);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input!!, please enter a valid input.");
        }
        // Sorting LinkedList in alphabetical order by "name" field
        Collections.sort(list, new Comparator<CustomObject>() {
            @Override
            public int compare(CustomObject one, CustomObject two) {
                return one.name.compareTo(two.name);
            }
        });
        // Printing sorted list
        System.out.println("Sorted list:");
        for (CustomObject obj : list) {
            System.out.println(obj.name);
        }
    }
    static class CustomObject {
        String name;
        public CustomObject(String name) {
            this.name = name;
        }
    }
}
