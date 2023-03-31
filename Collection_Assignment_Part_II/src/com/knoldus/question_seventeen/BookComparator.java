package com.knoldus.question_seventeen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Main {

    public static void main(String[] args) {
        // Create some sample books
        Book book1 = new Book("Absalom, Absalom!", "William Faulkner", 100.99);
        Book book2 = new Book("All Passion Spent", "Vita Sackville-West", 120.99);

        // Create a list of books
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        // Sort the list of books using the BookComparator
        Collections.sort(books, new BookComparator());

        // Print the sorted list of books
        for (Book book : books) {
            System.out.println("[Author_Name:- "+book.getAuthor() + "],  [Title_Name:-  " + book.getTitle() + "],  [Price:- $" + book.getPrice()+"]");
        }

        BookComparator  bookComparator = new BookComparator();
        System.out.println(bookComparator.compare(book1,book2));
    }
}
class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book bookOne, Book bookTwo) {
        int authorComparison = bookOne.getAuthor().compareTo(bookTwo.getAuthor());
        if (authorComparison != 0) {
            return authorComparison;
        }
        return Double.compare(bookTwo.getPrice(), bookOne.getPrice());
    }
}

