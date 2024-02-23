package com.ynov.oop;

import java.time.LocalDate;
import java.time.Period;

// Définition de la classe Employee (employé)
class Employee {
    private String name; // Nom de l'employé
    private String position; // Poste de l'employé
    private double salary; // Salaire de l'employé
    private LocalDate hireDate; // Date d'embauche de l'employé

    // Constructeur de la classe Employee pour initialiser les attributs
    public Employee(String name, String position, double salary, LocalDate localDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.hireDate = localDate;
    }

    // Méthode pour augmenter le salaire de l'employé en pourcentage
    public void raiseSalary(double percentage) {
        double increase = salary * (percentage / 100);
        salary += increase;
    }

    // Méthode pour calculer l'ancienneté de l'employé en années
    public int calculateSeniority() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    // Méthode pour donner une promotion à l'employé avec une augmentation de salaire
    public void promotion(String newPosition) {
        double salaryIncrease = 0.3 * salary;
        salary += salaryIncrease;
        position = newPosition;
    }

    // Méthode pour afficher les détails de l'employé
    public void displayDetails() {
        System.out.println("Nom: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salaire: " + salary);
        System.out.println("Ancienneté: " + calculateSeniority() + " ans");
    }

    // Méthode pour obtenir le poste de l'employé
    public String getPosition() {
        return position;
    }

    // Méthode pour obtenir le salaire de l'employé
    public double getSalary() {
        return salary;
    }
}
