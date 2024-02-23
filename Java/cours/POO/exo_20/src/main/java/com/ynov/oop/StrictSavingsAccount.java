package com.ynov.oop;

// Classe représentant un compte d'épargne strict, héritant de la classe SavingsAccount
public class StrictSavingsAccount extends SavingsAccount {

    // Constructeur appelant le constructeur de la classe parente avec un solde initial et un taux d'intérêt
    public StrictSavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    // Méthode redéfinie pour effectuer un transfert avec des modifications spécifiques pour le compte d'épargne strict
    @Override
    public boolean transfer(double amount, BankAccount otherAccount) {
        // Vérifie si le montant est positif, si le solde est suffisant et si le compte de destination n'est pas le même que le compte source
        if (amount > 0 && balance >= amount && this != otherAccount) {
            // Déduit le montant du solde du compte d'épargne strict
            balance -= amount;
            // Ajoute le montant au solde de l'autre compte
            otherAccount.balance += amount;

            // Si le transfert provient de ce compte, fixe le taux d'intérêt du compte de destination à 0
            if (otherAccount instanceof StrictSavingsAccount) {
                ((StrictSavingsAccount) otherAccount).interestRate = 0;
            }
            // Indique que le transfert a réussi
            return true;
        }
        // Indique que le transfert a échoué
        return false;
    }

    // Méthode redéfinie pour récupérer le type de compte (spécifique au compte d'épargne strict)
    @Override
    public String getType() {
        return "Strict Savings Account";
    }
}
