package com.ynov.oop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Définition de la classe BankAccount
class BankAccount {
    // Attributs privés de la classe
    private String accountHolder;  // Titulaire du compte
    private double balance;        // Solde du compte
    private String accountNumber;  // Numéro de compte
    private double interestRate;   // Taux d'intérêt

    // Constructeur de la classe BankAccount
    public BankAccount(String accountHolder, String accountNumber, double interestRate) {
        this.accountHolder = accountHolder;   // Initialisation du titulaire du compte
        this.accountNumber = accountNumber;   // Initialisation du numéro de compte
        this.interestRate = interestRate;     // Initialisation du taux d'intérêt
        this.balance = 0.0;                  // Initialisation du solde à zéro
    }

    // Méthode pour exécuter une transaction
    public void executeTransaction(Transaction transaction) {
        double transactionAmount = transaction.transactionAmount;  // Montant de la transaction
        balance += transactionAmount;  // Mise à jour du solde avec le montant de la transaction
    }

    // Méthode pour calculer l'intérêt sur une période donnée en mois
    public void calculateInterest(int months) {
        double monthlyInterest = balance * (interestRate / 12);  // Calcul de l'intérêt mensuel
        balance += monthlyInterest * months;  // Mise à jour du solde avec l'intérêt cumulé sur la période
    }

    // Méthode pour obtenir le numéro de compte
    public String getAccountNumber() {
        return accountNumber;  // Renvoie le numéro de compte
    }
}
