package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Contract {
    private LocalDate start;
    private LocalDate end;
    private int budget;

    public Contract(LocalDate start, LocalDate end, int budget) {
        this.start = start;
        this.end = end;
        this.budget = budget;
    }

    public LocalDate getStartContract() {
        return start;
    }

    public void setStartContract(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEndContract() {
        return end;
    }

    public void setEndContract(LocalDate end) {
        this.end = end;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
