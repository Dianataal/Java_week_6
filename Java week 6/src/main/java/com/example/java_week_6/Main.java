package com.example.java_week_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding books to the library
        library.addBook(library.new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        library.addBook(library.new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        library.addBook(library.new Book("NHL Hockey", "Stanley Kupp", 1952));
        library.addBook(library.new Book("Battle Axes", "Tom A. Hawk", 1851));

        // Asking user for the search term
        System.out.print("Enter search term: ");
        String searchTerm = scanner.nextLine();

        // Performing searches
        System.out.println("Search by title '" + searchTerm + "':");
        for (Library.Book book : library.searchByTitle(searchTerm)) {
            System.out.println(book);
        }

        System.out.println("---");

        System.out.println("Search by publisher '" + searchTerm + "':");
        for (Library.Book book : library.searchByPublisher(searchTerm)) {
            System.out.println(book);
        }

        // Don't forget to close the scanner
        scanner.close();
    }
}
