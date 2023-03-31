package com.knoldus.question_thirteen;

import java.util.*;

public class ShufflingValuesInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (type a non-integer to finish):");

        // Read integers from the scanner and add them to the list
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            list.add(num);
        }

        // Shuffle the order of the elements in the list using Collections.shuffle()
        Collections.shuffle(list);

        System.out.println("Shuffled list of integers: " + list);
    }
}

