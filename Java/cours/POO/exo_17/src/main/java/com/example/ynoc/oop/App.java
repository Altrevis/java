package com.example.ynoc.oop;

public class App {
    public static void main(String[] args) {
        // Création de l'arbre pour l'opération (9324 + (38676 - 9877) * 2)
        Node tree = new AdditionNode(
            new ValueNode(9324),
            new MultiplicationNode(
                new SubtractionNode(
                    new ValueNode(38676),
                    new ValueNode(9877)
                ),
                new DoubleNode(
                    new ValueNode(1) // Utilisation d'un nœud ValueNode arbitraire ici
                )
            )
        );

        // Affichage de l'arbre
        System.out.print("Arbre: ");
        tree.print();
        System.out.println();

        // Calcul de l'opération
        int result = tree.calculate();
        System.out.println("Résultat: " + result);
    }
}
