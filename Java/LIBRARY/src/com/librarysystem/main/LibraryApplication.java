package com.librarysystem.main;

import com.librarysystem.data.Database;
import com.librarysystem.service.LibraryService;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class LibraryApplication {
    private static Database database = new Database();
    private static LibraryService libraryService = new LibraryService(database);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }
    private static void handleBorrowBook(){}
    private static void handleReturnBool(){}
    private static void handleViewBorrowBooks(){}
    private static void showMenu(){}
    private static void populateInitialData(){}
    private static void clearConsole(){}
}
