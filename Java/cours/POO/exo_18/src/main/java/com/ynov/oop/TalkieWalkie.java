package com.ynov.oop;
// Classe pour le premier module radio (Talkie Walkie)
public class TalkieWalkie implements RadioModule {
    private static final double[] FREQUENCIES = {400.5, 431, 452, 486.5, 512.5};
    private int currentFrequencyIndex;

    public TalkieWalkie() {
        // Initialiser à la première fréquence
        currentFrequencyIndex = 0;
    }

    @Override
    public void switchToNextFrequency() {
        currentFrequencyIndex = (currentFrequencyIndex + 1) % FREQUENCIES.length;
    }

    @Override
    public void switchToPreviousFrequency() {
        currentFrequencyIndex = (currentFrequencyIndex - 1 + FREQUENCIES.length) % FREQUENCIES.length;
    }

    @Override
    public double getCurrentFrequency() {
        return FREQUENCIES[currentFrequencyIndex];
    }
}

