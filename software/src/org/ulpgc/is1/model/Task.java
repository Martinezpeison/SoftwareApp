package org.ulpgc.is1.model;

import java.util.Date;

public class Task extends Effort{

    private String taskName;
    private String taskDescription;
    private Date taskStart;
    private Date taskEnd;
    private Effort effort;

    public Task(String taskName, String taskDescription, Date taskStart, Date taskEnd, int amount) {
        super(amount);
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStart = taskStart;
        this.taskEnd = taskEnd;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getTaskStart() {
        return taskStart;
    }

    public void setTaskStart(Date taskStart) {
        this.taskStart = taskStart;
    }

    public Date getTaskEnd() {
        return taskEnd;
    }

    public void setTaskEnd(Date taskEnd) {
        this.taskEnd = taskEnd;
    }
    public void addEffort(int additionalEffort) {
        int actualEffort = getAmount();
        setAmount(actualEffort + additionalEffort);
    }
}
