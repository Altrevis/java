import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {
    
    // Méthode pour formater une date et heure complètes en texte complet
    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null; // Si la date et l'heure sont nulles, retourne null
        }
        // Définit un format de date et heure complet avec jour, mois, année, heure et minute
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Le' dd MMM 'de l''an' yyyy 'à' HH'h'mm'm et' ss's'", Locale.FRENCH);
        return dateTime.format(formatter); // Formate la date et l'heure avec le format spécifié et le locale français
    }
    
    // Méthode pour formater une date simple
    public static String formatSimple(LocalDate date) {
        if (date == null) {
            return null; // Si la date est nulle, retourne null
        }
        // Définit un format de date simple avec mois, jour et année
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(formatter); // Formate la date avec le format spécifié et le locale italien
    }
    
    // Méthode pour formater une heure au format ISO
    public static String formatIso(LocalTime time) {
        if (time == null) {
            return null; // Si l'heure est nulle, retourne null
        }
        // Définit un format de temps au format ISO avec heures, minutes et secondes
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter); // Formate l'heure avec le format spécifié
    }

}
