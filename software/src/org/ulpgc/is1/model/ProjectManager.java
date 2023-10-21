package org.ulpgc.is1.model;
import java.time.LocalDate;
import java.util.List;

public class ProjectManager {
    private List<Customer> customers;
    private List<Project> projects;
    private List<Employee> employees;

    public ProjectManager(List<Customer> customers, List<Project> projects, List<Employee> employees) {
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
    public void project(List<Project> projects) {
        this.projects = projects;
    }
}
