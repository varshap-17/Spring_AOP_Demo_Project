package com.example.springaop_demo.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("circle's setter is called");
    }
    public String setNameAndReturn(String name){
        this.name=name;
        System.out.println("circle's setter method");
        return name;
    }
}
