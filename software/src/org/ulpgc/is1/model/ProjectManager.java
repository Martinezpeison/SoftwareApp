package org.ulpgc.is1.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.ulpgc.is1.model.ProjectType.webDevelopment;

public class ProjectManager {
    private List<Customer> customers = new ArrayList<>();
    public Project project;
    private List<Employee> employees = new ArrayList<>();

    public ProjectManager() {
        this.customers = customers;
        this.project = project;
        this.employees = employees;
    }

    public void addCustomer(Customer customer) {
        customers.add(new Customer("John", "Doe", "123456789"));
        customers.add(new Customer("Jane", "McDonald's", "98765432n"));
    }
    public void addEmployee(Employee newEmployee) {
        employees.add(new Employee("Juan", "juan@gmail.com"));
        employees.add(new Employee("Pedro", "pedro@gmail.com"));
    }
    public List<Customer> getCustomer() {
        return customers;
    }
    public List<Employee> getEmployee() {
        return employees;
    }
    public Customer getCustomer(int index) {
        return customers.get(index);
    }
    public Employee getEmployee(int index) {
        return employees.get(index);
    }
    public void project(Project project){
        Project project1 = new Project("Project1",
                "Project description",
                webDevelopment,
                getCustomer().get(0),
                getEmployee().get(1),
                getEmployee().get(0),
                LocalDate.of(2020, 12, 12),
                LocalDate.of(2021, 12, 12),
                250000);
    }
}
