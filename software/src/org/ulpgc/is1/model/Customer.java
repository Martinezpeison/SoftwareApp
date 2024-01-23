package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer{
    private String name;
    private String surname;
    private List<Project> projectsAsCustomer = new ArrayList<>();
    private Phone phone;


    public Customer(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phone = new Phone();
        this.setPhone(phoneNumber);
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
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(String phoneNumber) {
        this.phone.setNumber(phoneNumber);
    }
    public void addProjectAsCustomer(Project project){
        this.projectsAsCustomer.add(project);
    }
    public List<Project> getProjectsAsCustomer() {
        return projectsAsCustomer;
    }
    public String toString() {
        return  name
                + " "
                + surname
                + ", "
                + phone.isValid(phone.getNumber());
    }
}