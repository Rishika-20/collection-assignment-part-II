package com.knoldus.question_twelve;
import java.util.*;

public class CalculateMaxValueInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (type a non-integer to finish):");

        // Read integers from the scanner and add them to the list
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            list.add(num);
        }

        // Find the maximum value in the list using Collections.max()
        int max = Collections.max(list);

        System.out.println("Maximum value in the list is: " + max);
    }
}

