package com.librarysystem.service;

import com.librarysystem.data.Database;
import com.librarysystem.models.Book;
import com.librarysystem.models.User;

import javax.xml.crypto.Data;

public class LibraryService {
    private Database database;
    public LibraryService(Database database) {
        this.database = database;
    }

    public void borrowBook(User user, String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book == null || isBookAlreadyBorrowed(book)) {
            throw new IllegalArgumentException("Book cannot be borrowed.");
        }
        user.borrowBook(book);
    }

    public void returnBook(User user, String isbn) {
        Book book = user.getBorrowedBooks().stream()
                .filter(b -> b.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
        if(book != null) {
            user.returnBook(book);
        }
    }
    private Book findBookByIsbn(String isbn) {
        for (Book book: database.getBooks()) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
    }
    private boolean isBookAlreadyBorrowed(Book book) {
        for (User user: database.getUsers()) {
            if(user.getName().equalsIgnoreCase(name.toLowerCase())) {
                return;
            }
        }
    }
}
