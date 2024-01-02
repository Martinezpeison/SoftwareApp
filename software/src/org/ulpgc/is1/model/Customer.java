package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Phone{
    private String name;
    private String surname;
    private List<Project> projectsAsCustomer = new ArrayList<>();

    public Customer(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addProjectAsCustomer(Project project){
        this.projectsAsCustomer.add(project);
    }
}