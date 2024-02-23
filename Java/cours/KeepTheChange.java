import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class KeepTheChange {
    // Méthode pour calculer le nombre minimal de pièces pour constituer un montant donné
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        int max = amount + 1; // Définit une valeur maximale initiale pour les calculs
        int[] dp = new int[amount + 1]; // Tableau pour stocker le nombre minimal de pièces pour chaque montant
        Arrays.fill(dp, max); // Initialise toutes les valeurs du tableau à une valeur maximale
        dp[0] = 0; // Aucune pièce n'est nécessaire pour atteindre un montant de 0

        // Parcourt les montants de 1 à 'amount'
        for (int i = 1; i <= amount; i++) {
            // Parcourt toutes les pièces disponibles
            for (int coin : coins) {
                // Si la pièce est inférieure ou égale au montant actuel
                if (coin <= i) {
                    // Met à jour dp[i] en prenant le minimum entre sa valeur actuelle et dp[i - coin] + 1
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // Si le nombre minimal de pièces pour atteindre 'amount' est supérieur à 'amount', il n'y a pas de solution
        if (dp[amount] > amount) {
            return null;
        }

        List<Integer> change = new ArrayList<>(); // Liste pour stocker les valeurs des pièces pour constituer le montant
        // Reconstruit la solution en parcourant les montants à partir de 'amount' jusqu'à 1
        while (amount > 0) {
            // Parcourt toutes les pièces disponibles
            for (int coin : coins) {
                // Si la pièce est inférieure ou égale à 'amount' et en utilisant cette pièce, on peut atteindre 'amount'
                if (amount >= coin && dp[amount] == dp[amount - coin] + 1) {
                    // Ajoute la valeur de la pièce à la liste 'change'
                    change.add(coin);
                    // Met à jour le montant en soustrayant la valeur de la pièce
                    amount -= coin;
                    // Interrompt la boucle pour passer au montant suivant
                    break;
                }
            }
        }

        return change; // Retourne la liste contenant les valeurs des pièces à utiliser pour constituer le montant
    }
}
