package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
    private List<Developer> developers = new ArrayList<>();

    public Developer(String employeeName, String employeeEmail, List<Developer> developers) {
        super(employeeName, employeeEmail);
        this.developers = developers;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
