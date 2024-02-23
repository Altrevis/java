package com.ynov.oop;

import java.util.ArrayList;
import java.util.List;

// Définition de la classe Company (entreprise)
class Company {
    private List<Employee> employees; // Liste des employés de l'entreprise

    // Constructeur de la classe Company
    public Company() {
        employees = new ArrayList<>(); // Initialise la liste des employés lors de la création de l'entreprise
    }

    // Méthode pour ajouter un employé à l'entreprise
    public void addEmployee(Employee employee) {
        employees.add(employee); // Ajoute un employé à la liste des employés de l'entreprise
    }

    // Méthode pour rechercher des employés par poste et renvoyer une liste
    public List<Employee> findEmployeeByPosition(String position) {
        List<Employee> result = new ArrayList<>(); // Crée une nouvelle liste pour stocker les employés trouvés
        for (Employee employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(position)) { // Si le poste de l'employé correspond à celui recherché (ignorant la casse)
                result.add(employee); // Ajoute l'employé à la liste des employés trouvés
            }
        }
        return result; // Renvoie la liste des employés trouvés
    }

    // Méthode pour calculer le salaire moyen de tous les employés dans l'entreprise
    public double averageSalary() {
        if (employees.isEmpty()) { // Si l'entreprise n'a pas d'employés, le salaire moyen est de 0
            return 0.0;
        }
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary(); // Ajoute le salaire de chaque employé au total
        }
        return totalSalary / employees.size(); // Calcule et renvoie le salaire moyen
    }

    // Méthode pour afficher les détails de tous les employés de l'entreprise
    public void displayEmployees() {
        for (Employee employee : employees) {
            employee.displayDetails(); // Affiche les détails de chaque employé
            System.out.println(); // Ajoute une ligne vide pour séparer les informations des employés
        }
    }
}
