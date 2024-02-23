package com.ynov.oop;

import java.util.List;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Crée deux employés avec leurs informations initiales
        Employee employee1 = new Employee("John", "Junior", 30000, LocalDate.of(1990, 5, 15));
        Employee employee2 = new Employee("Jane", "Senior", 45000, LocalDate.of(1985, 8, 10));

        // Crée une entreprise
        Company company = new Company();

        // Ajoute les employés à l'entreprise
        company.addEmployee(employee1);
        company.addEmployee(employee2);

        // Affiche le salaire moyen dans l'entreprise
        System.out.println("Salaire moyen dans l'entreprise: " + company.averageSalary());

        // Affiche les détails des employés occupant des postes à responsabilité
        System.out.println("\nSalariés occupant des postes à responsabilité:");
        List<Employee> seniorEmployees = company.findEmployeeByPosition("Senior");
        for (Employee employee : seniorEmployees) {
            employee.displayDetails();
        }
    }
}
