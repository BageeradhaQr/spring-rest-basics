package com.practice.spring.springboot.beans;

public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String emailId;

    //parameterised constructor
    public Customer(int customerId,String firstName,String lastName,String emailId){
        this.customerId =customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
