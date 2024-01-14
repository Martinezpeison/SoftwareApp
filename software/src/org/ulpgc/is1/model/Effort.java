package org.ulpgc.is1.model;

import java.util.List;

public class Effort {
    private int amount;
    private Employee employee;
    private Task task;
    public Effort(int amount, Employee employee, Task task) {
        this.amount = amount;
        this.employee = employee;
        this.task = task;
        this.employee.addEffort(this);
        this.task.addEffort(this);

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
