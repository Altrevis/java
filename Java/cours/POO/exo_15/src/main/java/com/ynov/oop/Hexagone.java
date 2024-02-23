package com.ynov.oop;

// Classe représentant un hexagone, implémente l'interface Forme
class Hexagone implements Forme {
    // Attribut représentant la longueur des côtés de l'hexagone
    private double longueur;

    // Constructeur pour initialiser la longueur des côtés de l'hexagone lors de sa création
    public Hexagone(double longueur) {
        this.longueur = longueur;
    }

    // Implémentation de la méthode pour calculer l'aire de l'hexagone
    @Override
    public double calculerAire() {
        // Formule de calcul de l'aire d'un hexagone régulier
        return (3 * Math.sqrt(3) * Math.pow(longueur, 2)) / 2;
    }

    // Implémentation de la méthode pour calculer le périmètre de l'hexagone
    @Override
    public double calculerPerimetre() {
        // Formule de calcul du périmètre d'un hexagone régulier
        return 6 * longueur;
    }
}
