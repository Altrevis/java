public class StringConcat {
    // Méthode pour concaténer deux chaînes de caractères
    public static String concat(String s1, String s2) {
        // Vérifie si les deux chaînes sont null, auquel cas la méthode renvoie null
        if (s1 == null && s2 == null) {
            return null;
        }
        // Si l'une des chaînes est null, la remplace par une chaîne vide
        if (s1 == null) {
            s1 = "";
        }
        if (s2 == null) {
            s2 = "";
        }
        // Utilise l'opérateur de concaténation '+' pour concaténer les chaînes
        return s1 + s2;
    }
}
