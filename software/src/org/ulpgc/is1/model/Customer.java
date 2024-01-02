package org.ulpgc.is1.model;

public class Customer extends Phone{
    private String name;
    private String surname;
    private Phone phoneNumber;

    public Customer(String name, String surname, String phoneNumber) {
        super(phoneNumber);
        this.name = name;
        this.surname = surname;
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

    public String toString() {
        return  "Customer: " + name + " "
                + surname + '\n'
                + "Phone Number: " + getPhoneNumber() + '\n';
    }
    public String getToString() {
        return  toString();
    }
}