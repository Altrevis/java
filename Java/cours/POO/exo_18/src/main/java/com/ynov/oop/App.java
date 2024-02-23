package com.ynov.oop;
// Exemple d'utilisation
public class App {
    public static void main(String[] args) {
        TalkieWalkie talkieWalkie = new TalkieWalkie();
        RadioFM radioFM = new RadioFM();

        ConnectedObject connectedObject1 = new ConnectedObject(talkieWalkie);
        ConnectedObject connectedObject2 = new ConnectedObject(radioFM);

        // Utilisation de l'objet connecté avec le premier module radio
        connectedObject1.switchRadioToNextFrequency();
        System.out.println("Talkie Walkie Frequency: " + connectedObject1.getCurrentRadioFrequency());

        // Utilisation de l'objet connecté avec le deuxième module radio
        connectedObject2.switchRadioToNextFrequency();
        System.out.println("Radio FM Frequency: " + connectedObject2.getCurrentRadioFrequency());
    }
}
