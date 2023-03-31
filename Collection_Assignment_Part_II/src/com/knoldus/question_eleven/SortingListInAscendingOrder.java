package com.knoldus.question_eleven;
import java.util.*;

//Sorting a list into an ascending order.
public class SortingListInAscendingOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Enter strings (type a blank line to finish):");

        // Read strings from the scanner and add them to the list
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }
        // Sort the list in ascending order using Collections.sort()
        Collections.sort(list);

        System.out.println("Sorted strings in ascending order: " + list);
    }
}

