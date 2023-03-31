package com.knoldus.question_fourteen;
import java.util.*;
public class SortingMapByValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Enter key-value pairs (in integer format) for the map (type a non-string key to finish):");
        try {
            // Read key-value pairs from the scanner and add them to the map
            while (scanner.hasNext()) {
                String key = scanner.next();
                if (!isInteger(key)) break; // stop if the key is not an integer
                int value = scanner.nextInt();
                map.put(key, value);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid Input, please enter a valid input.");
        }
            // Sort the map in descending order by value using a List of Map.Entry objects and Collections.sort()
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> entryOne, Map.Entry<String, Integer> entryTwo) {
                    return entryTwo.getValue().compareTo(entryOne.getValue()); // sort in descending order by value
                }
            });

            // Print out the sorted map
            System.out.println("Sorted map in descending order by value:");
            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
    }

    // Utility method to check if a string can be parsed as an integer
    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

