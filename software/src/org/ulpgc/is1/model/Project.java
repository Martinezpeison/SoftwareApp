package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.List;

public class Project {
    private int NEXT_ID = 0;
    private int projectId;
    private String projectName;
    private String projectDescription;
    private ProjectType projectType;
    private Manager manager;
    private List<Developer> developers;
    public Project(int projectId, String projectName, String projectDescription, ProjectType projectType, Manager manager){
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

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }
}
