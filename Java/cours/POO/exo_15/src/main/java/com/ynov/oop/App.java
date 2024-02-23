package com.ynov.oop;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Création d'objets de formes avec des dimensions spécifiques
        Rectangle rectangle = new Rectangle(3, 5);
        Cercle cercle = new Cercle(6);
        Hexagone hexagone = new Hexagone(4);

        // Création d'une liste de formes
        List<Forme> formes = new ArrayList<>();
        formes.add(rectangle);
        formes.add(cercle);
        formes.add(hexagone);

        // Création d'une instance de la classe Calculatrice en lui passant la liste de formes
        Calculatrice calculatrice = new Calculatrice(formes);

        // Appel de la méthode pour afficher la somme des aires des formes
        calculatrice.afficherSommeAire();

        // Appel de la méthode pour afficher la somme des périmètres des formes
        calculatrice.afficherSommePerimetre();
    }
}
