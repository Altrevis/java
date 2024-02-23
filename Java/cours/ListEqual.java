import java.util.List;

public class ListEqual {
    
    // Méthode statique pour vérifier l'égalité de deux listes de chaînes de caractères
    public static boolean areListEquals(List<String> list1, List<String> list2) {
        if (list1 == null && list2 == null) {
            return true; // Retourne true si les deux listes sont nulles
        }
        if (list1 == null || list2 == null || list1.size() != list2.size()) {
            return false; // Retourne false si une des listes est nulle ou si elles n'ont pas la même taille
        }
        // Parcourt les deux listes
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) { // Si les éléments aux index i ne sont pas égaux
                return false; // Les listes ne sont pas égales
            }
        }
        return true; // Si toutes les paires d'éléments correspondants sont égales, les listes sont égales
    }
}
