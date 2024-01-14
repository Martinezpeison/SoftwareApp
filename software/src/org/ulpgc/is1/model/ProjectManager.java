package org.ulpgc.is1.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.ulpgc.is1.model.ProjectType.webDevelopment;

public class ProjectManager {
    public List<Customer> customers = new ArrayList<>();
    public List<Project> projects = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public ProjectManager() {
        this.customers = customers;
        this.projects = projects;
        this.employees = employees;
    }

    public void addCustomer(String name, String surname, String phoneNumber) {
        this.customers.add(new Customer(name, surname, phoneNumber));
    }
    public void addEmployee(String name, String email) {
        this.employees.add(new Employee(name, email));
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }
    public Employee getEmployee(int index) {
        return employees.get(index);
    }
    public void addProject(String projectName, String projectDescription, ProjectType projectType, LocalDate start, LocalDate end, int budget) {
        this.projects.add(new Project(projectName, projectDescription, projectType, start, end, budget));
    }
    public Project getProject(int index) {
        return projects.get(index);
    }
}
