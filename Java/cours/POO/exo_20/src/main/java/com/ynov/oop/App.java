package com.ynov.oop;

public class App {
    public static void main(String[] args) {
        // Example usage

        // Création d'un compte bancaire de base avec un solde initial de 1000
        BankAccount basicAccount = new BankAccount(1000);
        // Affichage du solde du compte bancaire de base
        System.out.println("Compte principale Balance: " + basicAccount.getBalance());

        // Création d'un compte courant avec un solde initial de 2000
        CurrentAccount currentAccount = new CurrentAccount(2000);
        // Affichage du solde du compte courant
        System.out.println("Compte courrant Balance: " + currentAccount.getBalance());

        // Création d'un compte d'épargne avec un solde initial de 3000 et un taux d'intérêt de 0.05
        SavingsAccount savingsAccount = new SavingsAccount(3000, 0.15);
        // Affichage du solde du compte d'épargne
        System.out.println("Compte sauvegardé Balance: " + savingsAccount.getBalance());

        // Création d'un compte d'épargne strict avec un solde initial de 4000 et un taux d'intérêt de 0.03
        StrictSavingsAccount strictSavingsAccount = new StrictSavingsAccount(4000, 0.13);
        // Affichage du solde du compte d'épargne strict
        System.out.println("Compte d'épargne strict Balance: " + strictSavingsAccount.getBalance());
    }
}
