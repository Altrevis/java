import java.util.ArrayList;
import java.util.List;

// Classe abstraite représentant un personnage
public abstract class Character {
    
    // Attributs
    private final int maxHealth; // Santé maximale
    protected int currentHealth; // Santé actuelle
    private final String name; // Nom du personnage
    private final Weapon weapon; // Arme du personnage
    private static List<Character> allCharacters = new ArrayList<>(); // Liste de tous les personnages

    // Constructeur
    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.weapon = weapon;
        allCharacters.add(this); // Ajoute ce personnage à la liste de tous les personnages
    }

    // Méthodes d'accès aux attributs
    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    // Méthodes abstraites à implémenter dans les sous-classes
    public abstract void takeDamage(int damage); // Méthode pour subir des dégâts

    public abstract void attack(Character character); // Méthode pour attaquer un autre personnage

    // Méthode statique pour afficher le statut de tous les personnages
    public static String printStatus() {
        if (allCharacters.isEmpty()) {
            return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------";
        } else {
            StringBuilder status = new StringBuilder("------------------------------------------\nCharacters currently fighting :\n");
            for (Character character : allCharacters) {
                status.append(" - ").append(character.toString()).append("\n"); // Ajoute chaque personnage à la chaîne de statut
            }
            status.append("------------------------------------------");
            return status.toString();
        }
    }

    // Méthode statique pour simuler un combat entre deux personnages
    public static Character fight(Character character1, Character character2) {
        while (character1.getCurrentHealth() > 0 && character2.getCurrentHealth() > 0) {
            character1.attack(character2); // character1 attaque character2
            if (character2.getCurrentHealth() > 0) { // Si character2 est toujours en vie
                character2.attack(character1); // character2 attaque character1
            }
        }
        return character1.getCurrentHealth() > 0 ? character1 : character2; // Retourne le personnage gagnant
    }
}
