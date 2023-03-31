package com.knoldus.quewstion_five;
import java.util.*;
public class TopWords {
    public static void main(String[] args) {

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCounts = new HashMap<>();

        // Read the document from the console using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the document (press Ctrl+D to finish):");
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        // Find the top 10 most frequent words using a priority queue
        PriorityQueue<Map.Entry<String, Integer>> priorityQueueq = new PriorityQueue<>(
                (first, second) -> second.getValue() - first.getValue());
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            priorityQueueq.offer(entry);
        }
        System.out.println("Top 10 most frequent words:");
        for (Integer index = 0; index < 10 && !priorityQueueq.isEmpty(); index++) {
            Map.Entry<String, Integer> entry = priorityQueueq.poll();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
