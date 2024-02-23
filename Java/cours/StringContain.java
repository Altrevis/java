public class StringContain {
    // Méthode pour vérifier si une sous-chaîne est contenue dans une chaîne donnée
    public static boolean isStringContainedIn(String subString, String s) {
        // Vérifie si l'une des chaînes est null, auquel cas la méthode renvoie false
        if (subString == null || s == null) {
            return false;
        }
        // Utilise la méthode contains() de la classe String pour vérifier si la sous-chaîne est contenue dans la chaîne
        return s.contains(subString);
    }
}
