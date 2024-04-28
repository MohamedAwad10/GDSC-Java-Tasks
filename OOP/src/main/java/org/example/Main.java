package org.example;

import org.example.library.Book;
import org.example.library.DVD;
import org.example.library.Library;
import org.example.library.Magazine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book1", "mohamed", 2022, 50);
        Book book2 = new Book("book2", "ali", 2002, 100);
        DVD dvd1 = new DVD("Quran", "hassan", 2004, "2 hours");
        Book book3 = new Book("book3", "ahmed", 2010, 60);
        Book book4 = new Book("book4", "wael", 2009, 70);
        Magazine m1 = new Magazine("magazine1", "waleed", 2006, "arabic");

        Library myLibrary = new Library("library1", "zefta", "mohamed");
//        Library l1 = new Library("library2", "tanta", "ahmed");
//
//        l1.addItem(book1);
//        l1.addItem(book2);
//        l1.displayAllItems();

        myLibrary.addItem(book1);
        myLibrary.addItem(dvd1);
        myLibrary.addItem(book2);
        myLibrary.addItem(m1);
        myLibrary.addItem(book4);
//        myLibrary.deleteItem(book1);
        myLibrary.displayAllItems();

        myLibrary.checkAvailability(book1);

//        myLibrary.updateItem(book2, book3);
        myLibrary.deleteItem(2);
        myLibrary.updateItem(book2, book3);
//        myLibrary.deleteItem(book1);
        myLibrary.displayAllItems();
    }
}