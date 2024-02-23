import java.util.List;

public class ListContains {
    
    // Méthode statique pour vérifier si une liste contient une certaine valeur
    public static boolean containsValue(List<Integer> list, Integer value) {
        return list.contains(value); // Utilise la méthode contains de la classe List pour vérifier si la liste contient la valeur spécifiée
    }
}
