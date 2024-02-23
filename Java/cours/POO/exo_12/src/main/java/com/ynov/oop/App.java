package com.ynov.oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicule Vehicule = new Moto();

        Vehicule.move();
        Vehicule.brake();

        if(Vehicule instanceof Moto motoVehicule) {
            motoVehicule.mettreLaBequille();
        }

        if(Vehicule instanceof Car carVehicule) {
            carVehicule.fermerLesPortes();
        }
    }
}
