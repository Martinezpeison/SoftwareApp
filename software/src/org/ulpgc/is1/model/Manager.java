package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee {
    private Employee employee;
    private List<Project> projects;
    public void addProject(Project newProject) {
        projects.add(newProject);
    }

    public Manager(String employeeName, String employeeEmail, String taskName, String taskDescription, TaskType taskType, LocalDate taskStart, LocalDate taskEnd, int effort, Employee employee) {
        super(employeeName, employeeEmail, taskName, taskDescription, taskType, taskStart, taskEnd, effort);
        this.employee = employee;
    }

}
