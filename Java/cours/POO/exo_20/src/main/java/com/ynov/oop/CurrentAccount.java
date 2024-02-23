package com.ynov.oop;

// Classe représentant un compte courant, héritant de la classe de base BankAccount
public class CurrentAccount extends BankAccount {

    // Constructeur prenant un solde initial, appelant le constructeur de la classe de base et initialisant le numéro de compte
    public CurrentAccount(double balance) {
        super(balance);
        // Initialisation du numéro de compte avec le préfixe "CA" suivi d'un nombre aléatoire à 6 chiffres
        this.accountNumber = "CA" + (int) (random() * 1000000);
    }

    private int random() {
        return 0;
    }

    // Méthode pour retirer un montant du solde du compte courant
    public void withdraw(double amount) {
        // Vérifie si le montant est positif et si le solde est suffisant
        if (amount > 0 && balance >= amount) {
            // Déduit le montant du solde du compte courant
            balance -= amount;
        }
    }

    // Méthode pour déposer un montant dans le solde du compte courant
    public void deposit(double amount) {
        // Vérifie si le montant est positif
        if (amount > 0) {
            // Ajoute le montant au solde du compte courant
            balance += amount;
        }
    }

    // Méthode redéfinie pour récupérer le type de compte (spécifique au compte courant)
    @Override
    public String getType() {
        return "Current Account";
    }
}
