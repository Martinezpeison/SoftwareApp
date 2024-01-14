package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task{

    private String name;
    private String description;
    private LocalDate start;
    private LocalDate end;
    private TaskType taskType;
    private List<Effort> efforts = new ArrayList<>();

    public Task(String name, String description, LocalDate start, LocalDate end, TaskType taskType) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
        this.taskType = taskType;
    }

    public void addEffort(Effort effort) {
        if (effort != null && effort.getAmount() >= 0) {
            this.efforts.add(effort);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public TaskType getTaskType() {
        return taskType;
    }


    public String toString() {
        return  "Task: " + name + '\n'
                + "Description: " + description + '\n'
                + "Start: " + start + '\n'
                + "End: " + end + '\n';
    }
}
