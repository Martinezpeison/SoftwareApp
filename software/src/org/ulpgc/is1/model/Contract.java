package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Contract {
    private LocalDate startContract;
    private LocalDate endContract;
    private int budget;

    public Contract(LocalDate startContract, LocalDate endContract, int budget) {
        this.startContract = startContract;
        this.endContract = endContract;
        this.budget = budget;
    }

    public LocalDate getStartContract() {
        return startContract;
    }

    public void setStartContract(LocalDate startContract) {
        this.startContract = startContract;
    }

    public LocalDate getEndContract() {
        return endContract;
    }

    public void setEndContract(LocalDate endContract) {
        this.endContract = endContract;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
