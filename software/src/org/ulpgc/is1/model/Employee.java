package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String employeeName;
    private String employeeEmail;
    private List<Task> tasks = new ArrayList<>();
    private List<Project> projectsAsDeveloper = new ArrayList<>();
    private List<Project> projectsAsManager = new ArrayList<>();
    public Employee(String employeeName, String employeeEmail) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
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
    public String toString() {
        return  "Employee: "
                + employeeName
                + '\n'
                + "Email: "
                + employeeEmail
                + '\n';
    }
}
