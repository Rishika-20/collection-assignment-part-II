package com.knoldus.question_eight;

import java.util.*;

public class TreeMapToLinkedHashMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        try {
            // Prompt the user to enter string-integer pairs and add them to a TreeMap.
            System.out.println("Enter string-integer pairs to add to TreeMap (type 'done' when finished):");
            String input = scanner.nextLine();

            while (!input.equals("done")) {
                String[] pair = input.split(" ");
                String key = pair[0];
                int value = Integer.parseInt(pair[1]);
                treeMap.put(key, value);
                input = scanner.nextLine();
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid Input!!");
        }

        // Sort the entries in descending order by their values and store them in a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        treeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(entry -> linkedHashMap.put(entry.getKey(), entry.getValue()));

        // Print the sorted entries in the LinkedHashMap
        System.out.println("Sorted string-integer pairs in descending order by value:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}


