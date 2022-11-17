package com.example.springaop_demo.service;

import com.example.springaop_demo.model.Circle;
import com.example.springaop_demo.model.Triangle;

public class FactoryService {
    public Object getBean(String BeanType){
        if (BeanType.equals("shapeService"))
            return new ShapeServiceProxy();
        if (BeanType.equals("circle"))
            return new Circle();
        if (BeanType.equals("triangle"))
            return new Triangle();
        return null;
    }
}
