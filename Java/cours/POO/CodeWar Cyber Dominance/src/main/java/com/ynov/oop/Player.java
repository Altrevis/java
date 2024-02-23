package com.ynov.oop;

import java.util.ArrayList;

// La classe Player représente un joueur dans un scénario de jeu
public class Player {

    // Attributs du joueur
    private String name;
    private int processingPower;
    private int encryptionKeys;
    private ArrayList<String> knownServers;
    public int clesChiffrement;
    public int puissanceCalcul;

    // Constructeur pour initialiser un joueur avec un nom
    public Player(String name) {
        this.name = name;
        this.processingPower = 0;
        this.encryptionKeys = 0;
        this.knownServers = new ArrayList<>();
    }

    public Player() {
    }

    // Méthodes d'accès pour les attributs du joueur
    public String getName() {
        return name;
    }

    public int getProcessingPower() {
        return processingPower;
    }

    public int getEncryptionKeys() {
        return encryptionKeys;
    }

    public ArrayList<String> getKnownServers() {
        return knownServers;
    }

    // Méthodes de modification pour mettre à jour les attributs du joueur
    public void setProcessingPower(int processingPower) {
        this.processingPower = processingPower;
    }

    public void setEncryptionKeys(int encryptionKeys) {
        this.encryptionKeys = encryptionKeys;
    }

    // Méthodes pour gérer les serveurs connus par le joueur
    public void addKnownServer(String ipAddress) {
        knownServers.add(ipAddress);
    }

    public void removeKnownServer(String ipAddress) {
        knownServers.remove(ipAddress);
    }

    // Méthodes pour vérifier les interactions du joueur avec les serveurs
    public boolean ownsServer(String ipAddress) {
        // Vérifie si le joueur possède le serveur avec l'adresse IP donnée
        return false;
    }

    public boolean knowsServer(String ipAddress) {
        // Vérifie si le joueur connaît le serveur avec l'adresse IP donnée
        return false;
    }

    public boolean hasAnalysedServer(String ipAddress) {
        // Vérifie si le joueur a déjà analysé le serveur avec l'adresse IP donnée
        return false;
    }

    // Méthodes pour les actions du joueur sur les serveurs
    public boolean executeAction(String action, Server server) {
        // Exécute l'action spécifiée sur le serveur
        return false;
    }

    public boolean canExecuteAction(String action, Server server) {
        // Vérifie si l'action spécifiée peut être exécutée sur le serveur
        return false;
    }

    // Méthodes pour le début et la fin du tour du joueur
    public void startTurn(ArrayList<Server> servers) {
        // Actions à exécuter au début du tour du joueur
    }

    public void endTurn() {
        // Actions à exécuter à la fin du tour du joueur
    }

    // Méthode pour vérifier si le joueur a la dominance sur tous les serveurs
    public boolean hasDominance(ArrayList<Server> servers) {
        // Vérifie si le joueur a pris le contrôle de tous les serveurs
        return false;
    }

    public Object getPlayerName() {
        return null;
    }

    public void effectuerEncryption(Server serveur1) {
        throw new UnsupportedOperationException("Unimplemented method 'effectuerEncryption'");
    }

    public void effectuerAnalyseReseau(Server serveur1) {
        throw new UnsupportedOperationException("Unimplemented method 'effectuerAnalyseReseau'");
    }

    public void effectuerDominationServeur(Server serveur2) {
        throw new UnsupportedOperationException("Unimplemented method 'effectuerDominationServeur'");
    }
}
