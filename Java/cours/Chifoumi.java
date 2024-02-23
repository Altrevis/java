public class Chifoumi {

    // Méthode statique pour obtenir l'action battue par une action donnée
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        switch (chifoumiAction) {
            case ROCK:
                return ChifoumiAction.SCISSOR; // La pierre bat les ciseaux
            case PAPER:
                return ChifoumiAction.ROCK; // Le papier bat la pierre
            case SCISSOR:
                return ChifoumiAction.PAPER; // Les ciseaux battent le papier
            default:
                return null; // Si l'action donnée n'est pas valide, retourne null
        }        
    }
}
