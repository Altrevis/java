package com.ynov.oop;

// Classe représentant un compte d'épargne, héritant de la classe de base BankAccount
public class SavingsAccount extends BankAccount {
    // Attribut pour le taux d'intérêt du compte d'épargne
    protected float interestRate;

    // Constructeur prenant un solde initial et un taux d'intérêt, appelant le constructeur de la classe de base et initialisant le numéro de compte
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        // Convertit le taux d'intérêt en float et l'initialise
        this.interestRate = (float) interestRate;
        // Initialisation du numéro de compte avec le préfixe "SA" suivi d'un nombre aléatoire à 6 chiffres
        this.accountNumber = "SA" + (int) (random() * 1000000);
    }

    private int random() {
        return 0;
    }

    // Méthode pour ajouter des intérêts au solde du compte d'épargne
    public void addInterest() {
        // Multiplie le solde par le taux d'intérêt et l'ajoute au solde actuel
        balance += balance * interestRate;
    }

    // Méthode pour récupérer le taux d'intérêt du compte d'épargne
    public float getInterestRate() {
        return interestRate;
    }

    // Méthode redéfinie pour effectuer un transfert avec des modifications spécifiques pour le compte d'épargne
    @Override
    public boolean transfer(double amount, BankAccount otherAccount) {
        // Vérifie si le montant est positif et si le solde est suffisant
        if (amount > 0 && balance >= amount) {
            // Déduit le montant du solde du compte d'épargne
            balance -= amount;
            // Ajoute le montant au solde de l'autre compte
            otherAccount.balance += amount;
            // Indique que le transfert a réussi
            return true;
        }
        // Indique que le transfert a échoué
        return false;
    }

    // Méthode redéfinie pour récupérer le type de compte (spécifique au compte d'épargne)
    @Override
    public String getType() {
        return "Savings Account";
    }
}
