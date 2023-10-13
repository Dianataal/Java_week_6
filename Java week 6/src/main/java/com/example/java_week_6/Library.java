package com.example.java_week_6;
import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : books) {
            if (StringUtils.included(book.getTitle(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : books) {
            if (StringUtils.included(book.getPublisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                found.add(book);
            }
        }
        return found;
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static class StringUtils {
        public static boolean included(String word, String searched) {
            if (word == null || searched == null) {
                return false;
            }
            word = word.trim().toLowerCase();
            searched = searched.trim().toLowerCase();
            return word.contains(searched);
        }
    }

    public class Book {
        private final String title;
        private final String publisher;
        private final int year;

        public Book(String title, String publisher, int year) {
            this.title = title;
            this.publisher = publisher;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public String getPublisher() {
            return publisher;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return title + ", " + publisher + ", " + year;
        }

    }

}
