package com.company;

public class Student {
    private int id;
    private int identityNumber;
    private String name;
    private String lastName;

    public Student() {

    }

    public Student(int id, int identityNumber, String name, String surname) {
        this.id = id;
        this.identityNumber = identityNumber;
        this.name = name;
        this.lastName = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
