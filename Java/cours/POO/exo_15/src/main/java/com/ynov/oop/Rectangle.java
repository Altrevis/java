package com.ynov.oop;

// Classe représentant un rectangle, implémente l'interface Forme
class Rectangle implements Forme {
    // Attributs représentant la longueur et la largeur du rectangle
    private double longueur;
    private double largeur;

    // Constructeur pour initialiser les dimensions du rectangle lors de sa création
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Implémentation de la méthode pour calculer l'aire du rectangle
    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    // Implémentation de la méthode pour calculer le périmètre du rectangle
    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
}
