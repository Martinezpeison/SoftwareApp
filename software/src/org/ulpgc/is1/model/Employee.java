package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String employeeName;
    private String employeeEmail;
    private List<Task> task;
    private List<Project> projects;

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

    public String getEmail() {
        return employeeEmail;
    }

    public void setEmail(String employeeEmail) {
        this.employeeEmail = Employee.this.employeeEmail;
    }
    public List<Task> getTask() {
        return task;
    }
    public void addTask(Task newTask) {
        task.add(newTask);
    }
    public void addProject(Project newProject) {
        projects.add(newProject);
    }
    public String toString() {
        return  "Employee: " + employeeName + '\n' + "Email: " + employeeEmail + '\n';
    }
}
