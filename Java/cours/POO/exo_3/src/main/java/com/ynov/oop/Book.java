package com.ynov.oop;

import java.time.LocalDate;

// Définition de la classe Book (livre)
class Book {
    private String title; // Titre du livre
    private String author; // Auteur du livre
    private int publicationYear; // Année de publication du livre
    private int numPages; // Nombre de pages du livre
    private boolean availability; // Disponibilité du livre (emprunté ou non)

    // Constructeur de la classe Book pour initialiser les attributs
    public Book(String title, String author, int publicationYear, int numPages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numPages = numPages;
        this.availability = true; // Le livre est initialement disponible
    }

    // Méthode pour emprunter le livre
    public void borrow() {
        if (availability) {
            availability = false;
            System.out.println("Le livre a été emprunté.");
        } else {
            System.out.println("Le livre n'est pas disponible.");
        }
    }

    // Méthode pour indiquer que le livre a été rendu
    public void giveBack() {
        if (!availability) {
            availability = true;
            System.out.println("Le livre est revenu.");
        }
    }

    // Méthodes pour obtenir les informations sur le livre
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getNumPages() {
        return numPages;
    }

    // Méthode pour vérifier la disponibilité du livre
    public boolean isAvailable() {
        return availability;
    }

    // Méthode pour calculer l'âge du livre en fonction de l'année actuelle
    public int calculateAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - publicationYear;
    }

    // Méthode pour ajouter des pages au livre
    public void addPages(int pagesToAdd) {
        numPages += pagesToAdd;
    }
}