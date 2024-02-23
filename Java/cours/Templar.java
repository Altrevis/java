public class Templar extends Character implements Healer, Tank {

    private final int healCapacity; // Capacité de guérison
    private final int shield; // Bouclier

    // Constructeur
    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon); // Appel du constructeur de la classe parente Character
        this.healCapacity = healCapacity; // Initialisation de la capacité de guérison
        this.shield = shield; // Initialisation du bouclier
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

    // Méthode pour obtenir la valeur du bouclier
    @Override
    public int getShield() {
        return shield; // Retourne la valeur du bouclier
    }

    // Méthode pour gérer les dégâts subis par le templier
    @Override
    public void takeDamage(int damage) {
        int actualDamage = damage - shield; // Calcule les dégâts réels après avoir pris en compte le bouclier
        if (actualDamage < 0) { // Vérifie si les dégâts réels sont négatifs (le bouclier a absorbé tous les dégâts)
            actualDamage = 0; // Si oui, les dégâts réels sont fixés à zéro
        }
        setCurrentHealth(getCurrentHealth() - actualDamage); // Soustrait les dégâts réels de la santé actuelle du templier
        if (getCurrentHealth() < 0) { // Vérifie si la santé est devenue négative
            setCurrentHealth(0); // Si oui, la fixe à zéro pour éviter les valeurs négatives
        }
    }

    // Méthode pour gérer l'attaque du templier
    @Override
    public void attack(Character character) {
        heal(this); // Guérit le templier lui-même avant d'attaquer
        int damage = getWeapon() != null ? getWeapon().getDamage() : 6; // Dégâts de l'arme ou dégât par défaut
        character.takeDamage(damage); // Inflige des dégâts au personnage passé en paramètre
    }

    // Méthode pour obtenir une représentation textuelle de l'état du templier
    @Override
    public String toString() {
        String weaponInfo = getWeapon() != null ? ". He has the weapon " + getWeapon().toString() : ""; // Informations sur l'arme
        if (getCurrentHealth() == 0) { // Vérifie si le templier est mort
            return getName() + " has been beaten, even with its " + shield + " shield. So bad, it could heal " + getHealCapacity() + " HP" + weaponInfo; // Message si le templier est mort
        } else {
            return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP and has a shield of " + shield + weaponInfo; // Message si le templier est en vie
        }
    }
}
