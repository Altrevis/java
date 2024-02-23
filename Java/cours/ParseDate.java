import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    // Méthode pour analyser une date au format ISO
    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null; // Retourne null si la chaîne est nulle ou vide
        }
        return LocalDateTime.parse(stringDate, DateTimeFormatter.ISO_DATE_TIME); // Analyse la chaîne en un objet LocalDateTime avec le format ISO_DATE_TIME
    }

    // Méthode pour analyser une date au format texte complet
    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null; // Retourne null si la chaîne est nulle ou vide
        }
        // Définit un formateur avec le modèle "EEEE dd MMMM yyyy" (jour de la semaine, jour, mois, année) et le locale France
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRANCE);
        return LocalDate.parse(stringDate, formatter); // Analyse la chaîne en un objet LocalDate avec le formateur spécifié
    }

    // Méthode pour analyser une heure au format spécifique
    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null; // Retourne null si la chaîne est nulle ou vide
        }
        String[] parts = stringDate.split(", | et "); // Divise la chaîne en parties en utilisant les séparateurs ", " et " et "
        int hours = Integer.parseInt(parts[0].split(" ")[0]); // Extrait les heures de la première partie
        int minutes = Integer.parseInt(parts[1].split(" ")[0]); // Extrait les minutes de la deuxième partie
        int seconds = Integer.parseInt(parts[2].split(" ")[0]); // Extrait les secondes de la troisième partie

        if (parts[0].contains("du soir")) { // Si la première partie contient "du soir", ajoute 12 heures (PM)
            hours += 12;
        }
        return LocalTime.of(hours, minutes, seconds); // Retourne un objet LocalTime avec les heures, minutes et secondes
    }
}
