package com.example.springaop_demo.service;

import com.example.springaop_demo.aspect.LoggingAspect;
import com.example.springaop_demo.model.Circle;

public class ShapeServiceProxy extends ShapeService{
    public Circle getCircle(){
        new LoggingAspect().LoggingAdvice();
        return super.getCircle();
    }
}
