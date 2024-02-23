package com.ynov.oop;
// Classe pour l'objet connecté
public class ConnectedObject {
    private RadioModule radioModule;

    public ConnectedObject(RadioModule radioModule) {
        this.radioModule = radioModule;
    }

    public void switchRadioToNextFrequency() {
        radioModule.switchToNextFrequency();
    }

    public void switchRadioToPreviousFrequency() {
        radioModule.switchToPreviousFrequency();
    }

    public double getCurrentRadioFrequency() {
        return radioModule.getCurrentFrequency();
    }
}

