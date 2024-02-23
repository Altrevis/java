public class StringLength {
    // Méthode pour obtenir la longueur d'une chaîne de caractères
    public static int getStringLength(String s) {
        // Vérifie si la chaîne est null, auquel cas la longueur est considérée comme 0
        if (s == null) {
            return 0;
        }
        // Utilise la méthode length() de la classe String pour obtenir la longueur de la chaîne
        return s.length();
    }
}
