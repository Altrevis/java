package com.ynov.oop;

public class DefensivePlayStyle implements PlayStyle {
    @Override
    public String decideNextAction() {
        System.out.println("Je suis un joueur defensif");
        return null;
    }
}
