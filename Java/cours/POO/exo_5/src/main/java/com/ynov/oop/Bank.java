package com.ynov.oop;

import java.util.ArrayList;
import java.util.List;

// Définition de la classe Bank
class Bank {
    // Attributs privés de la classe
    private List<Client> clients;          // Liste des clients de la banque
    private List<Transaction> transactions; // Liste des transactions effectuées

    // Constructeur de la classe Bank
    public Bank() {
        clients = new ArrayList<>();       // Initialisation de la liste des clients (vide)
        transactions = new ArrayList<>();  // Initialisation de la liste des transactions (vide)
    }

    // Méthode pour ajouter un client à la banque
    public void addClient(Client client) {
        clients.add(client);  // Ajout du client à la liste de clients de la banque
    }

    // Méthode pour exécuter une transaction
    public void executeTransaction(Transaction transaction) {
        transaction.sourceAccount.executeTransaction(transaction);  // Exécution de la transaction sur le compte source
        transaction.targetAccount.executeTransaction(transaction);  // Exécution de la transaction sur le compte cible
        transactions.add(transaction);  // Ajout de la transaction à la liste des transactions effectuées
    }
}
