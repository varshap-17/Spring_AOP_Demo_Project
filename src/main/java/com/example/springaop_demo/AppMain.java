package com.example.springaop_demo;

import com.example.springaop_demo.service.FactoryService;
import com.example.springaop_demo.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args){
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springex.xml");
//        ShapeService service=applicationContext.getBean("shapeService",ShapeService.class);
//        service.getCircle();
        FactoryService factoryService=new FactoryService();
        ShapeService shapeService= (ShapeService) factoryService.getBean("shapeService");
        shapeService.getCircle();
    }
}
