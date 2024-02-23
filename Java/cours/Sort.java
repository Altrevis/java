import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

    // Méthode pour trier une liste d'entiers dans l'ordre croissant
    public static List<Integer> sort(List<Integer> list) {
        // Vérifie si la liste est null
        if (list == null) {
            return null;
        }
        // Crée une copie modifiable de la liste pour éviter de modifier l'original
        List<Integer> mutableList = new ArrayList<>(list);
        // Trie la liste dans l'ordre croissant en utilisant la méthode sort de Collections
        Collections.sort(mutableList);
        // Retourne la liste triée
        return mutableList;
    }

    // Méthode pour trier une liste d'entiers dans l'ordre décroissant
    public static List<Integer> sortReverse(List<Integer> list) {
        // Vérifie si la liste est null
        if (list == null) {
            return null;
        }
        // Crée une copie modifiable de la liste pour éviter de modifier l'original
        List<Integer> mutableList = new ArrayList<>(list);
        // Trie la liste dans l'ordre décroissant en utilisant la méthode sort de Collections avec un comparateur inverse
        Collections.sort(mutableList, Collections.reverseOrder());
        // Retourne la liste triée dans l'ordre décroissant
        return mutableList;
    }
}
