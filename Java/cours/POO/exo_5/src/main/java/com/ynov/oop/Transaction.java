package com.ynov.oop;

import java.util.Date;

// Définition de la classe Transaction
class Transaction {
    // Attributs privés de la classe
    private double transactionAmount;   // Montant de la transaction
    BankAccount sourceAccount;         // Compte source
    BankAccount targetAccount;         // Compte cible
    private Date transactionDate;       // Date de la transaction

    // Constructeur de la classe Transaction
    public Transaction(double transactionAmount, BankAccount sourceAccount, BankAccount targetAccount, Date transactionDate) {
        this.transactionAmount = transactionAmount;  // Initialisation du montant de la transaction
        this.sourceAccount = sourceAccount;          // Initialisation du compte source
        this.targetAccount = targetAccount;          // Initialisation du compte cible
        this.transactionDate = transactionDate;      // Initialisation de la date de la transaction
    }

    // Méthode pour afficher les détails de la transaction
    public void displayDetails() {
        System.out.println("Date de transaction: " + transactionDate);
        System.out.println("Montant: " + transactionAmount);
        System.out.println("Compte source : " + sourceAccount.getAccountNumber());
        System.out.println("Compte cible: " + targetAccount.getAccountNumber());
    }
}
