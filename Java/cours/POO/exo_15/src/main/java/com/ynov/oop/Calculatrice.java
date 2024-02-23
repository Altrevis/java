package com.ynov.oop;

import java.util.List;

// Classe représentant une calculatrice pour effectuer des opérations sur des formes géométriques
class Calculatrice {
    // Liste de formes sur laquelle la calculatrice effectuera des opérations
    private List<Forme> formes;

    // Constructeur qui initialise la calculatrice avec une liste de formes
    public Calculatrice(List<Forme> formes) {
        this.formes = formes;
    }

    // Méthode pour afficher la somme des aires des formes
    public void afficherSommeAire() {
        // Variable pour stocker la somme des aires
        double sommeAire = 0;

        // Parcours de la liste de formes et addition des aires de chaque forme
        for (Forme forme : formes) {
            sommeAire += forme.calculerAire();
        }

        // Affichage de la somme des aires
        System.out.println("Somme de l'aire des formes : " + sommeAire);
    }

    // Méthode pour afficher la somme des périmètres des formes
    public void afficherSommePerimetre() {
        // Variable pour stocker la somme des périmètres
        double sommePerimetre = 0;

        // Parcours de la liste de formes et addition des périmètres de chaque forme
        for (Forme forme : formes) {
            sommePerimetre += forme.calculerPerimetre();
        }

        // Affichage de la somme des périmètres
        System.out.println("Somme du périmètre des formes : " + sommePerimetre);
    }
}
