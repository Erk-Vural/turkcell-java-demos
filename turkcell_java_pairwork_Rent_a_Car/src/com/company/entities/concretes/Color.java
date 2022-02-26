package com.company.entities.concretes;

import com.company.core.entities.Entity;

public class Color extends Entity {
    private int id;
    private String name;

    public Color() {
    }

    public Color(int id, String name) {
        this.id = id;
        this.name = name;
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
}
