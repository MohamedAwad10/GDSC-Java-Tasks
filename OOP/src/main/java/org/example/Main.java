package org.example;

import org.example.library.Book;
import org.example.library.Library;
import org.example.library.Magazine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book1", "mohamed", 2022, 50);
        Book book2 = new Book("book2", "ali", 2002, 100);
        Book book3 = new Book("book3", "ahmed", 2010, 60);
        Book book4 = new Book("book4", "wael", 2009, 70);
        Magazine m1 = new Magazine("magazine1", "waleed", 2006, "arabic");

        Library l = new Library("library1", "zefta", "mohamed");
//        Library l1 = new Library("library2", "tanta", "ahmed");
//
//        l1.addItem(book1);
//        l1.addItem(book2);
//        l1.displayAllItems();

        l.addItem(book1);
//        l.addItem(book2);
        l.addItem(m1);
        l.addItem(book4);
        l.deleteItem(book1);
        l.displayAllItems();

        l.updateItem(book2, book3);
        l.displayAllItems();
    }
}