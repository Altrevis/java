import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude; // Magnitude de l'étoile

    // Constructeur par défaut
    public Star() {
        super(); // Appelle le constructeur de la classe parente (CelestialObject)
        this.magnitude = 0.0; // Initialise la magnitude à 0.0 par défaut
    }

    // Constructeur avec paramètres
    public Star(String name, double x, double y, double z, double magnitude, int mass) {
        super(name, x, y, z, mass); // Appelle le constructeur de la classe parente avec les paramètres appropriés
        this.magnitude = magnitude; // Initialise la magnitude avec la valeur fournie
    }

    // Getter pour la magnitude
    public double getMagnitude() {
        return this.magnitude;
    }

    // Setter pour la magnitude
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    // Méthode pour calculer le hashCode de l'objet (utilisé pour les collections basées sur le hachage)
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), magnitude);
    }

    // Méthode pour comparer deux objets Star pour l'égalité
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Star star = (Star) obj;
        return Double.compare(star.magnitude, magnitude) == 0;
    }

    // Méthode pour obtenir une représentation textuelle de l'étoile
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", getName(), magnitude);
    }
}
