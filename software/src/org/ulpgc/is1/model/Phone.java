package org.ulpgc.is1.model;

public class Phone {
    String phoneNumber;

    public String isValid(String phoneNumber) {
        if (phoneNumber.length() != 9 || !phoneNumber.matches("[0-9]+")) {
            return "XXXX";
        } else {
            return phoneNumber;
        }
    }
}