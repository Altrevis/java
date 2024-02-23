package com.ynov.oop;

import java.util.ArrayList;

// Définition de la classe Library (bibliothèque)
class Library {
    private ArrayList<Book> books; // Crée une liste d'objets Book pour stocker les livres de la bibliothèque

    // Constructeur de la classe Library
    public Library() {
        books = new ArrayList<>(); // Initialise la liste de livres lors de la création de la bibliothèque
    }

    // Méthode pour ajouter un livre à la bibliothèque
    public void addBook(Book book) {
        books.add(book); // Ajoute un livre à la liste de livres
    }

    // Méthode pour emprunter un livre par son titre
    public void borrowBook(String title) {
        for (Book book : books) { // Parcourt la liste de livres
            if (book.getTitle().equals(title)) { // Si le titre du livre correspond à celui recherché
                book.borrow(); // Marque le livre comme emprunté
                return; // Sort de la boucle
            }
        }
        System.out.println("Le livre n'est pas dans la bibliothèque."); // Affiche un message si le livre n'est pas trouvé
    }

    // Méthode pour rendre un livre emprunté
    public void giveBackBook(String title) {
        for (Book book : books) { // Parcourt la liste de livres
            if (book.getTitle().equals(title)) { // Si le titre du livre correspond à celui recherché
                book.giveBack(); // Marque le livre comme rendu
                return; // Sort de la boucle
            }
        }
        System.out.println("Le livre n'est pas dans la bibliothèque."); // Affiche un message si le livre n'est pas trouvé
    }

    // Méthode pour afficher les livres disponibles dans la bibliothèque
    public void displayAvailableBooks() {
        for (Book book : books) { // Parcourt la liste de livres
            if (book.isAvailable()) { // Si le livre est disponible (non emprunté)
                System.out.println("Titre : " + book.getTitle()); // Affiche le titre du livre
            }
        }
    }

    // Méthode pour rechercher des livres par auteur et renvoyer une liste
    public ArrayList<Book> findBookByAuthor(String authorName) {
        ArrayList<Book> authorBooks = new ArrayList<>(); // Crée une nouvelle liste pour stocker les livres de l'auteur
        for (Book book : books) { // Parcourt la liste de livres
            if (book.getAuthor().equals(authorName)) { // Si l'auteur du livre correspond à celui recherché
                authorBooks.add(book); // Ajoute le livre à la liste des livres de l'auteur
            }
        }
        return authorBooks; // Renvoie la liste des livres de l'auteur
    }

    // Méthode pour supprimer un livre (besoin d'implémentation)
    public void removeBook(String string) {
        // À implémenter si vous souhaitez ajouter une fonctionnalité de suppression de livres
    }
}