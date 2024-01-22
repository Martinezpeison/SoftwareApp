package org.ulpgc.is1.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.ulpgc.is1.model.ProjectType.webDevelopment;

public class ProjectManager {
    public List<Customer> customers = new ArrayList<>();
    public Project project;
    private List<Employee> employees = new ArrayList<>();

    public ProjectManager() {
        this.customers = customers;
        this.project = project;
        this.employees = employees;
    }

    public void addCustomer(String name, String surname, String number) {
        this.customers.add(new Customer(name, surname, number));
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
    public void project(String projectName, String projectDescription, ProjectType projectType) {
        this.project = new Project(projectName, projectDescription, projectType);
    }
    public Project getProject(int index) {
        return project;
    }
}
