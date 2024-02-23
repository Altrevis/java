package com.ynov.oop;

import java.util.ArrayList;
import java.util.List;

// Définition de la classe Client
class Client {
    // Attributs privés de la classe
    private String name;                   // Nom du client
    private List<BankAccount> bankAccounts; // Liste des comptes bancaires du client

    // Constructeur de la classe Client
    public Client(String name) {
        this.name = name;                          // Initialisation du nom du client
        this.bankAccounts = new ArrayList<>();     // Initialisation de la liste des comptes bancaires (vide)
    }

    // Méthode pour ajouter un compte bancaire au client
    public void addBankAccount(BankAccount account) {
        bankAccounts.add(account);  // Ajout du compte bancaire à la liste
    }

    // Méthode pour afficher les comptes bancaires du client
    public void displayBankAccounts() {
        System.out.println("Nom du client: " + name);
        System.out.println("Comptes bancaires:");
        for (BankAccount account : bankAccounts) {
            System.out.println("Numéro de compte: " + account.getAccountNumber());
            System.out.println("Solde du compte: " + account.balance);      // L'accès à l'attribut balance doit être discuté
            System.out.println("Taux d'intérêt: " + account.interestRate);  // L'accès à l'attribut interestRate doit être discuté
        }
    }
}
