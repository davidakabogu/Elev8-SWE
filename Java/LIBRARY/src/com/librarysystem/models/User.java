package com.librarysystem.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private final List<Book> borrowedBooks;

    // constructor method for User class
    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    // getter for Name
    public String getName() {
        return name;
    }

    // setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // getter for BorrowedBooks
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // method for borrowing books
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // method for returning books
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
