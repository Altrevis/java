package com.ynov.oop;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Livre 1", "Auteur 1", 2000, 300);
        Book book2 = new Book("Livre 2", "Auteur 2", 2010, 250);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Test des méthodes
        book1.borrow();
        book2.borrow();

        book1.giveBack();

        System.out.println("Livres disponibles dans la bibliothèque :");
        library.displayAvailableBooks();

        System.out.println("Âge du Livre 1 : " + book1.calculateAge());

        book2.addPages(50);
        System.out.println("Nombre de pages du Livre 1 : " + book1.getNumPages());

        ArrayList<Book> authorBooks = library.findBookByAuthor("Auteur 1");
        System.out.println("Livres de l'auteur 1 dans la bibliothèque :");
        for (Book book : authorBooks) {
            System.out.println("Titre : " + book.getTitle());
        }

        library.removeBook("Livre 1");
        System.out.println("Livres disponibles dans la bibliothèque après retrait :");
        library.displayAvailableBooks();
    }
}
