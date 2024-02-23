public class Palindrome {
    
    // Méthode statique pour vérifier si une chaîne est un palindrome
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false; // Retourne false si la chaîne est nulle
        }
        s = s.toLowerCase(); // Convertit la chaîne en minuscules pour ignorer la casse
        int i = 0, j = s.length() - 1; // Initialise deux indices pour parcourir la chaîne, i pour le début et j pour la fin
        while (i < j) { // Tant que les indices ne se croisent pas
            if (s.charAt(i) != s.charAt(j)) { // Si les caractères aux indices i et j sont différents
                return false; // La chaîne n'est pas un palindrome
            }
            i++; // Déplace l'indice i vers la droite
            j--; // Déplace l'indice j vers la gauche
        }
        return true; // Si la boucle se termine sans retourner false, la chaîne est un palindrome
    }
}
