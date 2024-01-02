package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project extends Contract{
    private int NEXT_ID = 0;
    private int projectId;
    private String projectName;
    private String projectDescription;
    private static List<Task> tasks;
    private Contract contract;
    private Employee manager;
    private Employee developers;
    private ProjectType projectType;
    private Customer customer;


    public Project(String projectName, String projectDescription, ProjectType projectType, Customer customer, Employee manager, Employee developers, LocalDate startContract, LocalDate endContract, int budget) {
        super(startContract, endContract, budget);
        this.projectId = NEXT_ID++;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectType = projectType;
        this.customer = customer;
        this.manager = manager;
        this.developers = developers;
        this.tasks = new ArrayList<>();
    }

    public int getNEXT_ID() {
        return NEXT_ID;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public static void addTask(Task newTask) {
        tasks.add(newTask);
    }

    public String toString() {
        return  "Project: " + projectName + '\n'
                + "Description: " + projectDescription + '\n'
                + "Project Type: " + projectType + '\n'
                + "Customer " + customer + '\n'
                + "Manager: " + manager + '\n'
                + "Developers: " + developers + '\n'
                + "Start Contract: " + getStartContract() + '\n'
                + "End Contract: " + getEndContract()+ '\n'
                + "Budget: " + getBudget() + '\n';
    }
}
