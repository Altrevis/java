public class Weapon {

    private final String name; // Nom de l'arme
    private final int damage; // Dégâts infligés par l'arme

    // Constructeur de l'arme
    public Weapon(String name, int damage) {
        this.name = name; // Initialisation du nom de l'arme
        this.damage = damage; // Initialisation des dégâts de l'arme
    }

    // Méthode pour obtenir le nom de l'arme
    public String getName() {
        return name; // Retourne le nom de l'arme
    }

    // Méthode pour obtenir les dégâts de l'arme
    public int getDamage() {
        return damage; // Retourne les dégâts de l'arme
    }

    // Redéfinition de la méthode toString pour obtenir une représentation textuelle de l'arme
    @Override
    public String toString() {
        return name + " deals " + damage + " damages"; // Retourne une chaîne indiquant le nom et les dégâts de l'arme
    }
}
