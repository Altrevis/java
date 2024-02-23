package com.ynov.oop;

// Classe représentant un cercle, implémente l'interface Forme
class Cercle implements Forme {
    // Attribut représentant le rayon du cercle
    private double rayon;

    // Constructeur pour initialiser le rayon du cercle lors de sa création
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Implémentation de la méthode pour calculer l'aire du cercle
    @Override
    public double calculerAire() {
        // Formule de calcul de l'aire d'un cercle
        return Math.PI * Math.pow(rayon, 2);
    }

    // Implémentation de la méthode pour calculer le périmètre du cercle
    @Override
    public double calculerPerimetre() {
        // Formule de calcul du périmètre d'un cercle
        return 2 * Math.PI * rayon;
    }
}

