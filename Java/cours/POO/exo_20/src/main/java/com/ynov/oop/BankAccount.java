package com.ynov.oop;

// Classe de base représentant un compte bancaire
public class BankAccount {
    // Attributs protégés pour le numéro de compte et le solde
    protected String accountNumber;
    protected double balance;

    // Constructeur protégé avec un solde initial et un numéro de compte initialisé à une chaîne vide
    protected BankAccount(double balance) {
        this.balance = balance;
        this.accountNumber = "";
    }

    // Méthode pour effectuer un transfert d'argent vers un autre compte
    public boolean transfer(double amount, BankAccount otherAccount) {
        // Vérifie si le montant est positif et si le solde est suffisant
        if (amount > 0 && balance >= amount) {
            // Déduit le montant du solde du compte actuel
            balance -= amount;
            // Ajoute le montant au solde de l'autre compte
            otherAccount.balance += amount;
            // Indique que le transfert a réussi
            return true;
        }
        // Indique que le transfert a échoué
        return false;
    }

    // Méthode pour récupérer le numéro de compte
    public String getAccountNumber() {
        return accountNumber;
    }

    // Méthode pour récupérer le solde du compte
    public double getBalance() {
        return balance;
    }

    // Méthode pour récupérer le type de compte (utilisé pour les sous-classes)
    public String getType() {
        return "Basic Account";
    }
}
