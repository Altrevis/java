public class ComputeArray {
    
    // Méthode pour effectuer des calculs sur un tableau d'entiers
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null; // Si le tableau est nul, retourne null
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                array[i] *= 5; // Si l'élément est divisible par 3, multiplie par 5
            } else if (array[i] % 3 == 1) {
                array[i] += 7; // Si l'élément donne un reste de 1 lors de la division par 3, ajoute 7
            }
        }
        return array; // Retourne le tableau modifié
    }
}
