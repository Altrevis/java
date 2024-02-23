public class Monster extends Character {

    // Constructeur
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon); // Appel du constructeur de la classe parente Character
    }

    // Méthode pour gérer les dégâts subis par le monstre
    @Override
    public void takeDamage(int damage) {
        int actualDamage = (int) Math.floor(damage * 0.8); // Réduction des dégâts de 20%
        setCurrentHealth(getCurrentHealth() - actualDamage); // Mise à jour de la santé actuelle
        if (getCurrentHealth() < 0) { // Vérification si la santé actuelle est devenue négative
            setCurrentHealth(0); // Si oui, on la ramène à zéro pour éviter les valeurs négatives
        }
    }

    // Méthode pour gérer l'attaque du monstre
    @Override
    public void attack(Character character) {
        int damage = getWeapon() != null ? getWeapon().getDamage() : 7; // Dégâts de l'arme du monstre ou dégât par défaut
        character.takeDamage(damage); // Applique les dégâts au personnage passé en paramètre
    }

    // Méthode pour obtenir une représentation textuelle de l'état du monstre
    @Override
    public String toString() {
        String weaponInfo = getWeapon() != null ? ". He has the weapon " + getWeapon().toString() : ""; // Informations sur l'arme
        if (getCurrentHealth() == 0) { // Vérifie si le monstre est mort
            return getName() + " is a monster and is dead" + weaponInfo; // Message si le monstre est mort
        } else {
            return getName() + " is a monster with " + getCurrentHealth() + " HP" + weaponInfo; // Message si le monstre est en vie
        }
    }
}
