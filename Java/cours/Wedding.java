import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wedding {
    // Méthode pour créer des couples aléatoires à partir de deux ensembles de personnes
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        // Vérifie si l'un des ensembles est null, auquel cas la méthode renvoie null
        if (first == null || second == null) {
            return null;
        }
        
        // Convertit les ensembles en listes pour permettre de les mélanger
        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);
        
        // Mélange les deux listes pour randomiser l'ordre des personnes
        Collections.shuffle(firstList);
        Collections.shuffle(secondList);
        
        // Initialise une nouvelle map pour stocker les couples
        Map<String, String> couples = new HashMap<>();
        
        // Parcourt les deux listes en même temps et forme des couples
        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            // Associe une personne de la première liste à une personne de la deuxième liste
            couples.put(firstList.get(i), secondList.get(i));
        }
        
        // Retourne la map des couples formés
        return couples;
    }
}
