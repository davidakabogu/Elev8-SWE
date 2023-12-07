package com.librarysystem.data;

import com.librarysystem.models.Book;
import com.librarysystem.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    private final List<Book> books;
    private final List<User> users;

    //constructor method for Database class
    public Database() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // method for searching for books by title
    public List<Book> searchBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    // method for searching for books by author
    public List<Book> searchBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
    }
    public User getUserInfo(String name) {
        return users.stream()
                .filter(user -> user.getName().equalsIgnoreCase(name.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    // method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // method to add users
    public void addUsers(User user) {
        users.add(user);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }
}
