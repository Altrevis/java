package com.ynov.oop;

import java.util.ArrayList;

// La classe Server représente un serveur dans le contexte du jeu
public class Server {

    // Attributs du serveur
    private String ipAddress;
    private String type;
    private Player owner;
    private boolean encrypted;
    private ArrayList<String> knownServers;
    public boolean estControleParJoueur;

    // Constructeur pour initialiser un serveur avec une adresse IP et un type
    public Server(String ipAddress, String type) {
        this.ipAddress = ipAddress;
        this.type = type;
        this.owner = null;
        this.encrypted = false;
        this.knownServers = new ArrayList<>();
    }

    public Server() {
    }

    // Méthodes d'accès pour les attributs du serveur
    public String getIpAddress() {
        return ipAddress;
    }

    public String getType() {
        return type;
    }

    public String getOwnerName() {
        return owner.getName();
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public ArrayList<String> getKnownServers() {
        return knownServers;
    }

    // Méthodes de modification pour mettre à jour les attributs du serveur
    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    // Méthode pour ajouter un serveur connu par ce serveur
    public void addKnownServer(String ipAddress) {
        knownServers.add(ipAddress);
    }
}
