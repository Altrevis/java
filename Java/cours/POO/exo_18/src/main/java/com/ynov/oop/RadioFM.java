package com.ynov.oop;
// Classe pour le deuxième module radio (Radio FM)
public class RadioFM implements RadioModule {
    private static final double MIN_FREQUENCY = 88;
    private static final double MAX_FREQUENCY = 108;
    private double currentFrequency;

    public RadioFM() {
        // Initialiser à la fréquence moyenne
        currentFrequency = (MIN_FREQUENCY + MAX_FREQUENCY) / 2;
    }

    @Override
    public void switchToNextFrequency() {
        if (currentFrequency < MAX_FREQUENCY - 0.5) {
            currentFrequency += 0.5;
        }
    }

    @Override
    public void switchToPreviousFrequency() {
        if (currentFrequency > MIN_FREQUENCY + 0.5) {
            currentFrequency -= 0.5;
        }
    }

    @Override
    public double getCurrentFrequency() {
        return currentFrequency;
    }
}

