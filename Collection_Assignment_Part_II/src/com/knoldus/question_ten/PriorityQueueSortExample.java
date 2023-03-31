package com.knoldus.question_ten;
import java.util.*;
public class PriorityQueueSortExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (or non-integers to exit): ");
        try {
            // Add integers to the priority queue
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                pq.add(num);
            }
        }catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }

        // Move integers from the priority queue to the list
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        System.out.println("Sorted integers in descending order: " + list);
    }
}
