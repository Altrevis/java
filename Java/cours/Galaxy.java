import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Galaxy {
    
    private List<CelestialObject> celestialObjects; // Liste des objets célestes dans la galaxie

    // Constructeur par défaut
    public Galaxy() {
        this.celestialObjects = new ArrayList<>(); // Initialise la liste des objets célestes
    }

    // Getter pour obtenir la liste des objets célestes
    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects; // Retourne la liste des objets célestes
    }

    // Méthode pour ajouter un objet céleste à la galaxie
    public void addCelestialObject(CelestialObject celestialObject) {
        this.celestialObjects.add(celestialObject); // Ajoute l'objet céleste à la liste
    }

    // Méthode pour calculer la répartition des masses des objets célestes dans la galaxie
    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new HashMap<>(); // Initialise la carte de répartition des masses
        massRepartition.put("Star", 0); // Initialise la masse des étoiles à 0
        massRepartition.put("Planet", 0); // Initialise la masse des planètes à 0
        massRepartition.put("Other", 0); // Initialise la masse des autres objets célestes à 0

        // Parcours de tous les objets célestes dans la galaxie
        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) { // Si l'objet est une étoile
                massRepartition.put("Star", massRepartition.get("Star") + obj.getMass()); // Ajoute sa masse à la répartition des étoiles
            } else if (obj instanceof Planet) { // Si l'objet est une planète
                massRepartition.put("Planet", massRepartition.get("Planet") + obj.getMass()); // Ajoute sa masse à la répartition des planètes
            } else { // Sinon, pour les autres types d'objets célestes
                massRepartition.put("Other", massRepartition.get("Other") + obj.getMass()); // Ajoute leur masse à la répartition des autres objets
            }
        }

        return massRepartition; // Retourne la répartition des masses
    }
}
