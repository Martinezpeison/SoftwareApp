package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String name;
    private String email;
    private List<Task> tasks = new ArrayList<>();
    private List<Project> projectsAsDeveloper = new ArrayList<>();
    private List<Project> projectsAsManager = new ArrayList<>();
    private List<Effort> efforts = new ArrayList<>();
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public List<Task> getTask() {
        return tasks;
    }
    public void addTask(Task newTask) {
        tasks.add(newTask);
    }
    public void addProjectAsDeveloper(Project project){
        this.projectsAsDeveloper.add(project);
    }
    public void addProjectAsManager(Project project){
        this.projectsAsManager.add(project);
    }
    public void addEffort(Effort effort) {
        this.efforts.add(effort);
    }
    public String toString() {
        return  "Employee: "
                + name
                + '\n'
                + "Email: "
                + email
                + '\n';
    }
}
