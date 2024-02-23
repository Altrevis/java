import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeddingComplex {
    // Méthode pour créer les meilleurs couples possibles entre deux ensembles de personnes
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> couple = new HashMap<>(); // Map pour stocker les couples
        Map<String, String> reverseCouple = new HashMap<>(); // Map pour stocker les couples inversés (partenaire en clé et personne en valeur)
        List<String> freeFirst = new ArrayList<>(first.keySet()); // Liste des personnes libres dans le premier ensemble

        // Tant qu'il y a des personnes libres dans le premier ensemble
        while (!freeFirst.isEmpty()) {
            String currentFree = freeFirst.remove(0); // Prend une personne libre
            List<String> preferences = first.get(currentFree); // Obtient les préférences de cette personne
            for (String preferred : preferences) { // Parcourt les préférences de cette personne
                // Si le partenaire préféré n'est pas déjà pris
                if (!couple.containsValue(preferred)) {
                    // Crée un couple entre la personne courante et son partenaire préféré
                    couple.put(currentFree, preferred);
                    reverseCouple.put(preferred, currentFree); // Met à jour le couple inversé
                    break; // Passe à la personne suivante
                } else {
                    // Sinon, trouve le partenaire actuel du partenaire préféré
                    String currentPartner = reverseCouple.get(preferred);
                    List<String> partnerPreferences = second.get(preferred); // Obtient les préférences du partenaire préféré
                    // Si le partenaire préféré préfère la personne courante à son partenaire actuel
                    if (partnerPreferences.indexOf(currentPartner) > partnerPreferences.indexOf(currentFree)) {
                        // Casse le couple entre le partenaire actuel et le partenaire préféré
                        couple.put(currentFree, preferred);
                        reverseCouple.put(preferred, currentFree); // Met à jour le couple inversé
                        freeFirst.add(currentPartner); // La personne actuelle devient libre
                        break; // Passe à la personne suivante
                    }
                }
            }
        }
        return couple; // Retourne les couples créés
    }
}
