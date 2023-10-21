package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.List;

public class Employee {
    private String employeeName;
    private String employeeEmail;
    private List<Task> task;

    public Employee(String employeeName, String employeeEmail,
                    String taskName, String taskDescription, LocalDate taskStart, LocalDate taskEnd, int effort) {
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
}
