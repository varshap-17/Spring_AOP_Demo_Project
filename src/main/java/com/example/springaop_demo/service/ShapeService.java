package com.example.springaop_demo.service;

import com.example.springaop_demo.aspect.Loggable;
import com.example.springaop_demo.model.Circle;
import com.example.springaop_demo.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;
    @Loggable
    public Circle getCircle(){
        System.out.println("get circle called");
        return circle;
    }
    public void setCircle(Circle circle){
        this.circle=circle;
    }
    public Triangle getTriangle(){
        return triangle;
    }
    public void setTriangle(Triangle triangle){
        this.triangle=triangle;
    }
}
