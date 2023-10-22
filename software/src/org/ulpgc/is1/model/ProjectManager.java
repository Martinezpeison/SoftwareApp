package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private List<Customer> customers = new ArrayList<>();
    public List<Project> projects = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public ProjectManager() {
        this.customers = customers;
        this.projects = projects;
        this.employees = employees;
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }
    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void project(Project newProject){projects.add(newProject);}
}
