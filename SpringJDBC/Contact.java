package com.SpringJDBC;

public class Contact {
    private String name;
    private String email;
    private String address;
    private String telephone;
    private int contactid;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactid(int contactid) {
        this.contactid = contactid;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getContactid() {
        return contactid;
    }

    public String getTelephone() {
        return telephone;
    }
}
