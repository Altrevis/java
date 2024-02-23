package com.ynov.oop;

public class AppTest2 {
    {
        System.out.println( "Hello World!" );
        
    /*faire afficher une liste de chiffre */
    int[] values = new int[10];
    for (int index = 0; index < 10; index += 1) {
        values[index] = index+1;
    }
    System.out.println("print the value inside the table values");
    for(int v: values) {
        System.out.println(v);
    }
    /*faire afficher la somme 1 */
    int j = 0, sum = 0;
    while(j < 5) {
        sum += j;
        j += 1;
    }
    System.out.println("afficher la valeur de sum");
    System.out.println(sum);
    int j2 = 0, sum2 = 0;
    /*faire afficher la somme 2 */
    do {
        sum2 += j2;
        j2 += 1;
     } while (j2 < 5); {
            System.out.println("afficher la valeur de sum2");
            System.out.println(sum2);
            
        }
    }
}
