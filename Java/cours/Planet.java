import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar; // Étoile centrale autour de laquelle la planète orbite

    // Constructeur par défaut
    public Planet() {
        super(); // Appelle le constructeur de la classe parent CelestialObject
        this.centerStar = new Star(); // Initialise l'étoile centrale avec une nouvelle instance par défaut
    }

    // Constructeur avec paramètres
    public Planet(String name, double x, double y, double z, Star centerStar, int mass) {
        super(name, x, y, z, mass); // Appelle le constructeur de la classe parent avec les paramètres spécifiés
        this.centerStar = centerStar; // Initialise l'étoile centrale avec celle spécifiée
    }

    // Getter pour récupérer l'étoile centrale
    public Star getCenterStar() {
        return this.centerStar;
    }

    // Setter pour définir l'étoile centrale
    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    // Méthode hashCode pour calculer le code de hachage de l'objet
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centerStar);
    }

    // Méthode equals pour vérifier l'égalité avec un autre objet
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
        Planet planet = (Planet) obj;
        return Objects.equals(centerStar, planet.centerStar);
    }

    // Méthode toString pour obtenir une représentation sous forme de chaîne de caractères de l'objet
    @Override
    public String toString() {
        double distanceWithCenterStar = CelestialObject.getDistanceBetween(this, centerStar); // Calcule la distance entre la planète et son étoile centrale
        return String.format("%s circles around %s at the %.3f AU", getName(), centerStar.getName(),
                distanceWithCenterStar); // Retourne une chaîne de caractères décrivant la planète et son orbite autour de son étoile centrale
    }
}
