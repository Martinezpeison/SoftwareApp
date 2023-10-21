package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.List;

public class Project {
    private int NEXT_ID = 0;
    private int projectId;
    private String projectName;
    private String projectDescription;
    private List<Task> task;

    public Project(int projectId, String projectName, String projectDescription,
                   String taskName, String taskDescription, LocalDate taskStart, LocalDate taskEnd, int effort){
        this.projectId = NEXT_ID++;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
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
    public List<Task> getTask() {
        return task;
    }
    public void addTask(Task newTask) {
        task.add(newTask);
    }
}
