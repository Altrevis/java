import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    
    // Méthode pour trouver le dernier index d'une valeur dans une liste
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null || list.isEmpty() || value == null) {
            return null; // Retourne null si la liste est nulle ou vide, ou si la valeur est nulle
        }
        // Parcourt la liste en partant de la fin
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(value)) { // Si la valeur à l'index i est égale à la valeur recherchée
                return i; // Retourne l'index
            }
        }
        return null; // Si la valeur n'est pas trouvée, retourne null
    }
    
    // Méthode pour trouver le premier index d'une valeur dans une liste
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null || list.isEmpty() || value == null) {
            return null; // Retourne null si la liste est nulle ou vide, ou si la valeur est nulle
        }
        // Parcourt la liste
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) { // Si la valeur à l'index i est égale à la valeur recherchée
                return i; // Retourne l'index
            }
        }
        return null; // Si la valeur n'est pas trouvée, retourne null
    }
    
    // Méthode pour trouver tous les indexes d'une valeur dans une liste
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> indexes = new ArrayList<>(); // Initialise une liste pour stocker les indexes
        if (list == null || list.isEmpty() || value == null) {
            return indexes; // Retourne une liste vide si la liste est nulle ou vide, ou si la valeur est nulle
        }
        // Parcourt la liste
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) { // Si la valeur à l'index i est égale à la valeur recherchée
                indexes.add(i); // Ajoute l'index à la liste des indexes
            }
        }
        return indexes; // Retourne la liste des indexes
    }
}
