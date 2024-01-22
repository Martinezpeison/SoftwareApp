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

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEndy(LocalDate end) {
        this.end = end;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
