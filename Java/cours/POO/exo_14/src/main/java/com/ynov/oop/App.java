package com.ynov.oop;

public class App 
{
    public static void main( String[] args )
    {
        Player joueur = new Player();

        PlayStyle agro = new AggressivePlayStyle();

        joueur.setPlayStyle(agro);
        joueur.decideNextAction();

        PlayStyle def = new DefensivePlayStyle();
        joueur.setPlayStyle(def);
        joueur.decideNextAction();
    }
}
