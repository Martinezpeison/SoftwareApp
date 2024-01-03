package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project extends Contract{
    private int NEXT_ID = 0;
    private int projectId;
    private String projectName;
    private String projectDescription;
    private static List<Task> tasks = new ArrayList<>();
    private ProjectType projectType;


    public Project(String projectName, String projectDescription, ProjectType projectType, LocalDate start, LocalDate end, int budget) {
        super(start, end, budget);
        this.projectId = NEXT_ID++;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectType = projectType;
    }

    public int getNEXT_ID() {
        return NEXT_ID;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(String name, String description, LocalDate start, LocalDate end, TaskType taskType) {
        this.tasks.add(new Task(name, description, start, end, taskType));
    }

    public String toString() {
        return  "Project: " + projectName + '\n'
                + "Description: " + projectDescription + '\n'
                + "Project Type: " + projectType + '\n'
                + "Start Contract: " + getStartContract() + '\n'
                + "End Contract: " + getEndContract()+ '\n'
                + "Budget: " + getBudget() + '\n';
    }
}
