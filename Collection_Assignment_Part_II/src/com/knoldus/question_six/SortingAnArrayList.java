package com.knoldus.question_six;
import java.util.*;

public class SortingAnArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(30, 50, 20, 10, 4));
        System.out.println("List before sorting: "+list);
        // Sort the ArrayList in ascending order
        Collections.sort(list);

        // Print the sorted ArrayList
        System.out.println("Sorted list: " + list);
    }
}


