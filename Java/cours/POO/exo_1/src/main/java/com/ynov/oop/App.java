package com.ynov.oop;

import javax.sound.midi.MidiFileFormat;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Myfeatures nouvelleFeatures = new Myfeatures();
        nouvelleFeatures.displayName();
        Myfeature n2 = new Myfeatures ("new name")
        n2.displayName();
        
    }
}
