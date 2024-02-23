public class DeadCharacterException extends Exception {
    
    private Character character; // Le personnage associé à l'exception

    // Constructeur prenant le personnage décédé comme paramètre
    public DeadCharacterException(Character character) {
        this.character = character;
    }

    // Redéfinition de la méthode getMessage() pour personnaliser le message d'erreur
    @Override
    public String getMessage() {
        // Récupération du nom de la classe du personnage (en minuscules) et son nom
        String className = character.getClass().getSimpleName().toLowerCase();
        String characterName = character.getName();
        // Construction du message d'erreur indiquant que le personnage est mort
        return "The " + className + " " + characterName + " is dead.";
    }
}
