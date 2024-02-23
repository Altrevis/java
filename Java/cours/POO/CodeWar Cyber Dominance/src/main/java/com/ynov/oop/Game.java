package com.ynov.oop;

import java.util.ArrayList;

public class Game {

    private int turn = 0;
    private Player player1;
    private Player player2;
    private ArrayList<Server> servers;

    // Initialise toutes les informations nécessaires pour la partie:
    // - les deux joueurs
    // - les serveurs représentant la grille de jeu
    public Game(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        servers = initializeServers();
    }

    // Exécute les actions de fin de tour pour le joueur actuel
    // puis passe au tour suivant
    public void endTurn() {
        currentPlayer().endTurn();
        turn++;
        startTurn();
    }

    // Retourne le nom du joueur actuel
    public String getCurrentPlayerName() {
        return currentPlayer().getName();
    }

    // Retourne la puissance de traitement du joueur actuel
    public int getCurrentPlayerProcessingPower() {
        return currentPlayer().getProcessingPower();
    }

    // Retourne le nombre de clés de chiffrement du joueur actuel
    public int getCurrentPlayerEncryptionKey() {
        return currentPlayer().getEncryptionKeys();
    }

    // retourne la liste des adresses IP des serveurs connus du joueur actuel
    public ArrayList<String> getCurrentPlayerKnownServers() {
        return currentPlayer().getKnownServers();
    }

    // Vérifie si le joueur actuel possède le serveur auquel appartient l'adresse IP
    // passée en paramètre
    public boolean serverBelongsToCurrentPlayer(String ipAddress) {
        return currentPlayer().ownsServer(ipAddress);
    }

    // Vérifie si le joueur actuel connaît le serveur auquel appartient l'adresse IP
    // passée en paramètre
    public boolean currentPlayerKnowServer(String ipAddress) {
        return currentPlayer().knowsServer(ipAddress);
    }

    // Retourne le type du serveur auquel appartient l'adresse IP passée en
    // paramètre
    public String getServerType(String ipAddress) {
        return findServer(ipAddress).getType();
    }

    // Vérifie si le serveur auquel appartient l'adresse IP passée en paramètre est
    // chiffré/
    public boolean serverIsEncrypted(String ipAddress) {
        return findServer(ipAddress).isEncrypted();
    }

    // Retourne le nom du joueur qui possède le serveur auquel appartient l'adresse
    // IP passée en paramètre/
    public String getServerOwnerName(String ipAddress) {
        return findServer(ipAddress).getOwnerName();
    }

    // Retourne la liste des adresses IP que le serveur auquel appartient l'adresse
    // IP passée en paramètre connaît
    public ArrayList<String> getKnownServer(String ipAddress) {
        return findServer(ipAddress).getKnownServers();
    }

    // Exécute l'action passée en paramètre sur le serveur auquel appartient
    // l'adresse IP passée en paramètre
    // Retourne vrai si l'action a été exécutée, sinon faux
    // @param action valeur possible: "encrypt", "decrypt", "serverDominance",
    // "networkTrafficAnalysis"
    public boolean executeActionOnServer(String action, String ipAddress) {
        return currentPlayer().executeAction(action, findServer(ipAddress));
    }

    // Vérifie si l'action passée en paramètre peut être exécutée sur le serveur
    // auquel appartient l'adresse IP passée en paramètre
    // @param action valeur possible: "encrypt", "decrypt", "serverDominance",
    // "networkTrafficAnalysis"
    public boolean canExecuteActionOnServer(String action, String ipAddress) {
        return currentPlayer().canExecuteAction(action, findServer(ipAddress));
    }

    // Vérifie si le joueur actuel a déjà analysé le serveur auquel appartient
    // l'adresse IP passée en paramètre
    public boolean currentPlayerHasAnalysedServer(String ipAddress) {
        return currentPlayer().hasAnalysedServer(ipAddress);
    }

    // Execute les actions de début de tour pour le joueur actuel
    public void startTurn() {
        currentPlayer().startTurn(servers);
    }

    // Vérifie si le joueur actuel a gagné
    public boolean currentPlayerWin() {
        return currentPlayer().hasDominance(servers);
    }

    // Retourne le joueur actuel
    private Player currentPlayer() {
        return (turn % 2 == 0) ? player1 : player2;
    }

    // Initialise les serveurs pour la partie
    private ArrayList<Server> initializeServers() {
        servers = new ArrayList<>();
        Server s1 = new Server("192.168.12.100", "log1");
        s1.setOwner(player1);
        player1.addKnownServer(s1.getIpAddress());
        servers.add(s1);

        Server s3 = new Server("192.168.14.100", "log2");
        servers.add(s3);

        Server s2 = new Server("192.168.13.100", "log3");
        s2.setOwner(player2);
        player2.addKnownServer(s2.getIpAddress());
        servers.add(s2);

        s1.addKnownServer(s3.getIpAddress());
        s3.addKnownServer(s1.getIpAddress());
        s3.addKnownServer(s2.getIpAddress());
        s2.addKnownServer(s3.getIpAddress());
        s2.addKnownServer(s1.getIpAddress());
        s1.addKnownServer(s2.getIpAddress());

        return servers;
        // Code pour initialiser les serveurs selon les règles du jeu
    }

    // Retourne le serveur correspondant à une adresse IP donnée
    private Server findServer(String ipAddress) {
        for (Server server : servers) {
            if (server.getIpAddress().equals(ipAddress)) {
                return server;
            }
        }
        return null; // Retourner null si le serveur n'est pas trouvé
    }
    

    public ArrayList<String> getAllServerIPs() {
        ArrayList<String> serverIPs = new ArrayList<>();
        for (Server server : servers) {
            serverIPs.add(server.getIpAddress());
        }
        return serverIPs;
    }
}
