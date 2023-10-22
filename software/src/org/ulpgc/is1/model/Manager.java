package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee {
    private Manager manager;

    public Manager(String employeeName, String employeeEmail) {
        super(employeeName, employeeEmail);
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
