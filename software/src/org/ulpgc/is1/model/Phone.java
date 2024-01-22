package org.ulpgc.is1.model;

public class Phone {
    String number;
    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return this.number;
    }
    public String isValid(String number) {
        if (number.length() != 9 || !number.matches("[0-9]+")) {
            return "XXXX";
        } else {
            return number.toString();
        }
    }
}