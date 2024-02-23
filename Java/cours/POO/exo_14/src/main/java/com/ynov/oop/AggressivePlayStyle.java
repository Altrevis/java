package com.ynov.oop;

public class AggressivePlayStyle implements PlayStyle {
    @Override
    public String decideNextAction() {
        System.out.println("Je suis un joueur agressif");
        return null;
    }
}
