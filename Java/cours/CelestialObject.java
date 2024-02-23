import java.util.Objects;

public class CelestialObject {
    
    private double x; // Position en x
    private double y; // Position en y
    private double z; // Position en z
    private String name; // Nom de l'objet céleste
    private int mass; // Masse de l'objet céleste
    
    // Constante pour la conversion des distances d'une unité astronomique en kilomètres
    public static final double KM_IN_ONE_AU = 150_000_000;

    // Constructeur par défaut
    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
        this.mass = 0;
    }

    // Constructeur avec paramètres
    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = mass; 
    }
    
    // Getters et setters pour les attributs
    public int getMass() {
        return this.mass;
    }
    
    public void setMass(int mass) {
        this.mass = mass;
    }
    
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Méthode statique pour obtenir la distance entre deux objets célestes
    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double dx = obj1.getX() - obj2.getX();
        double dy = obj1.getY() - obj2.getY();
        double dz = obj1.getZ() - obj2.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // Méthode statique pour obtenir la distance entre deux objets célestes en kilomètres
    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        return getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;
    }

    // Redéfinition de la méthode toString pour obtenir une représentation textuelle de l'objet céleste
    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
    }

    // Redéfinition de la méthode equals pour comparer deux objets célestes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CelestialObject that = (CelestialObject) obj;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0 &&
                Double.compare(that.z, z) == 0 &&
                Objects.equals(name, that.name);
    }

    // Redéfinition de la méthode hashCode pour générer un code de hachage pour l'objet céleste
    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }
}
