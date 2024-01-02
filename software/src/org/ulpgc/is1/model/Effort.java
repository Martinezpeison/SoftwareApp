package org.ulpgc.is1.model;

import java.util.List;

public class Effort {
    private int amount;
    private Employee employee;

    public Effort(int amount, Employee employee) {
        this.amount = amount;
        this.employee = employee;
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
}
