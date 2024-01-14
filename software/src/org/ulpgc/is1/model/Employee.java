package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String name;
    private String email;
    private List<Task> tasks;
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
    public void addTask(Task task) {
        tasks.add(task);
    }
    public void addProjectAsDeveloper(Project project){
        this.projectsAsDeveloper.add(project);
    }
    public void addProjectAsManager(Project project){
        this.projectsAsManager.add(project);
    }
    public List<Project> getProjectsAsDeveloper() {
        return projectsAsDeveloper;
    }
    public List<Project> getProjectsAsManager() {
        return projectsAsManager;
    }
    public void addEffort(Effort effort) {
        if (effort != null) {
            this.efforts.add(effort);
        }
    }
    public String toString() {
        return   name
                + ", "
                + email;
    }
}
