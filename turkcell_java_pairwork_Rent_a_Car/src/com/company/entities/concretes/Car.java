package com.company.entities.concretes;

import com.company.core.entities.Entity;

public class Car extends Entity {
    private int id;
    private String name;

    private Brand brand;
    private Color color;

    public Car() {
    }

    public Car(int id, String name, Brand brand, Color color) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
