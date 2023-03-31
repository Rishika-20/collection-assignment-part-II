package com.knoldus.question_seven;
import java.util.*;
public class HashSetToArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter strings and add them to a HashSet
        System.out.print("Enter strings to add to HashSet (type 'done' when finished): ");
        HashSet<String> hashSet = new HashSet<>();
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            hashSet.add(input);
            input = scanner.nextLine();
        }
        System.out.println("String in hashset:  "+hashSet);
        // Sort the strings in descending order and store them in an ArrayList
        ArrayList<String> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList, Collections.reverseOrder());

        // Print the sorted strings in the ArrayList
        System.out.println("\nSorted strings in descending order:");
        for (String str : arrayList) {
            System.out.println(str);
        }
    }

}


