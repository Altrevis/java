import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {
    
    // Méthode pour calculer la durée entre deux heures locales
    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        if (localTime1 == null || localTime2 == null) {
            return null; // Si l'une des heures est nulle, retourne null
        }
        Duration duration = Duration.between(localTime1, localTime2); // Calcule la durée entre les heures
        if (duration.isNegative()) { // Si la durée est négative (heure 2 avant heure 1)
            duration = duration.abs(); // Prend la valeur absolue de la durée
        }
        return duration; // Retourne la durée entre les heures
    }
    
    // Méthode pour calculer la période entre deux dates
    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        if (date1 == null || date2 == null) {
            return null; // Si l'une des dates est nulle, retourne null
        }
        Period period = Period.between(date1, date2); // Calcule la période entre les dates
        if (period.isNegative()) { // Si la période est négative (date 2 avant date 1)
            period = period.negated(); // Prend la valeur négative de la période
        }
        return period; // Retourne la période entre les dates
    }
    
    // Méthode pour calculer le nombre d'heures entre deux instants dans le temps
    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        if (dateTime1 == null || dateTime2 == null) {
            return null; // Si l'un des instants est nul, retourne null
        }

        Duration duration = Duration.between(dateTime1, dateTime2); // Calcule la durée entre les instants
        if (duration.isNegative()) { // Si la durée est négative (instant 2 avant instant 1)
            duration = duration.abs(); // Prend la valeur absolue de la durée
        }
        return duration.toHours(); // Retourne le nombre d'heures dans la durée
    }
}
