package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.Date;

public class Task extends Effort{

    private String taskName;
    private String taskDescription;
    private LocalDate taskStart;
    private LocalDate taskEnd;
    private Effort effort;
    private TaskType taskType;

    public Task(String taskName, String taskDescription, TaskType taskType,LocalDate taskStart, LocalDate taskEnd, int amount) {
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

    public LocalDate getTaskStart() {
        return taskStart;
    }

    public void setTaskStart(LocalDate taskStart) {
        this.taskStart = taskStart;
    }

    public LocalDate getTaskEnd() {
        return taskEnd;
    }

    public void setTaskEnd(LocalDate taskEnd) {
        this.taskEnd = taskEnd;
    }

    public TaskType getTaskType() { return taskType; }

    public void addEffort(Effort newEffort) {
        if(newEffort.getAmount()<=10 && newEffort.getAmount()>=0){
            setAmount(newEffort.getAmount());
        }else {
            System.out.println("El esfuerzo debe estar entre 0 y 10");
        }
    }
    public String toString() {
        return  "Task: " + taskName + '\n'
                + "Description: " + taskDescription + '\n'
                + "Start: " + taskStart + '\n'
                + "End: " + taskEnd + '\n';
    }
}
