package com.ynov.oop;

import java.util.Date;

// Classe principale de l'application
public class App {
    public static void main(String[] args) {
        // Crée une instance de la banque
        Bank bank = new Bank();

        // Crée des clients
        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");

        // Ajoute les clients à la banque
        bank.addClient(client1);
        bank.addClient(client2);

        // Crée des comptes bancaires pour les clients
        BankAccount account1 = new BankAccount("Client 1", "123456", 0.03);
        BankAccount account2 = new BankAccount("Client 2", "789012", 0.02);

        // Ajoute les comptes bancaires aux clients
        client1.addBankAccount(account1);
        client2.addBankAccount(account2);

        // Effectue une transaction
        Transaction transaction = new Transaction(100.0, account1, account2, new Date());
        bank.executeTransaction(transaction);

        // Affiche les détails des comptes des clients
        client1.displayBankAccounts();
        client2.displayBankAccounts();
    }
}


