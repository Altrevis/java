public class Sorcerer extends Character implements Healer {

    private final int healCapacity; // Capacité de guérison

    // Constructeur
    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon); // Appel du constructeur de la classe parente Character
        this.healCapacity = healCapacity; // Initialisation de la capacité de guérison
    }

    // Méthode pour obtenir la capacité de guérison
    @Override
    public int getHealCapacity() {
        return healCapacity; // Retourne la capacité de guérison
    }

    // Méthode pour guérir un personnage
    @Override
    public void heal(Character character) {
        int newHealth = character.getCurrentHealth() + healCapacity; // Calcule la nouvelle santé du personnage
        if (newHealth > character.getMaxHealth()) { // Vérifie si la santé dépasse la santé maximale du personnage
            newHealth = character.getMaxHealth(); // Si oui, fixe la santé au maximum
        }
        character.setCurrentHealth(newHealth); // Met à jour la santé du personnage
    }

    // Méthode pour gérer les dégâts subis par le sorcier
    @Override
    public void takeDamage(int damage) {
        setCurrentHealth(getCurrentHealth() - damage); // Soustrait les dégâts de la santé actuelle du sorcier
        if (getCurrentHealth() < 0) { // Vérifie si la santé est devenue négative
            setCurrentHealth(0); // Si oui, la fixe à zéro pour éviter les valeurs négatives
        }
    }

    // Méthode pour gérer l'attaque du sorcier
    @Override
    public void attack(Character character) {
        heal(this); // Guérit le sorcier lui-même avant d'attaquer
        int damage = getWeapon() != null ? getWeapon().getDamage() : 10; // Dégâts de l'arme ou dégât par défaut
        character.takeDamage(damage); // Inflige des dégâts au personnage passé en paramètre
    }

    // Méthode pour obtenir une représentation textuelle de l'état du sorcier
    @Override
    public String toString() {
        String weaponInfo = getWeapon() != null ? ". He has the weapon " + getWeapon().toString() : ""; // Informations sur l'arme
        if (getCurrentHealth() == 0) { // Vérifie si le sorcier est mort
            return getName() + " is a dead sorcerer. So bad, it could heal " + getHealCapacity() + " HP" + weaponInfo; // Message si le sorcier est mort
        } else {
            return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP" + weaponInfo; // Message si le sorcier est en vie
        }
    }
}
