package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project{
    private static int NEXT_ID = 0;
    private int id;
    private String name;
    private String description;
    private Contract contract;
    private Customer customer;
    private Employee manager;
    private List<Employee> developers = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();
    private ProjectType projectType;


    public Project(String name, String description, ProjectType projectType) {
        this.id = NEXT_ID++;
        this.name = name;
        this.description = description;
        this.projectType = projectType;
    }

    public int getNEXT_ID() {
        return NEXT_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(String name, String description, LocalDate start, LocalDate end, TaskType taskType) {
        this.tasks.add(new Task(name, description, start, end, taskType));
    }
    public Employee getManager() {
        return manager;
    }
    public void setManager(Employee manager) {
        this.manager = manager;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
        customer.addProjectAsCustomer(this);
    }
    public void addDeveloper(Employee developer) {
        this.developers.add(developer);
    }

    public String toString() {
        return  "Project: " + name + '\n'
                + "Description: " + description + '\n'
                + "Project Type: " + projectType + '\n'
                + "Start Contract: " + contract.getStart() + '\n'
                + "End Contract: " + contract.getEnd()+ '\n'
                + "Budget: " + contract.getBudget() + '\n';
    }
}
