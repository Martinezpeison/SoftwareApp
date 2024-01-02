package org.ulpgc.is1.model;

public class Phone {
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String isValid() {
        if (phoneNumber.length() != 9 || !phoneNumber.matches("[0-9]+")) {
            return "XXXX";
        } else {
            return phoneNumber;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}