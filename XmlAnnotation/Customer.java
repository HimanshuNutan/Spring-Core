package com.XmlAnnotation;

import org.springframework.beans.factory.annotation.Autowired;


public class Customer {
    private String name;
    private int amountpaid;

    @Autowired
    private Contact contact;

    public int getAmountpaid() {
        return amountpaid;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setAmountpaid(int amountpaid) {
        this.amountpaid = amountpaid;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }
}
