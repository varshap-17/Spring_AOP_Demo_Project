package com.example.springaop_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {
//    @Before("allGetters() && allCirclesMethods()")
//    public void LoggingAdvice(JoinPoint joinPoint){
//        System.out.println(joinPoint.getTarget());
//    }
//    @Before("allGetters()")
//    public void secondAdvice(){
//        System.out.println("Second method executed");
//    }
//    @AfterReturning(pointcut="args(name)",returning = "returnString")
//    public void StringArgumentMethod(String name,String returnString){
//        System.out.println("A method that takes string arguments has been called. The value is "+name+"the output value is return string"+returnString);
//    }
//    @AfterThrowing(value = "args(name)",throwing = "ex")
//    public void exceptionAdvice(String name,Exception ex){
//        System.out.println("An exception has been thrown"+ex);
//    }
//    @Around("allGetters()")
    public void MyAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("Before Advice");
            proceedingJoinPoint.proceed();
            System.out.println("After Returning");
        } catch (Throwable e) {
            System.out.println("After Throwing");
            throw new RuntimeException(e);
        }
        System.out.println("After Finally");
    }
    public void LoggingAdvice(){
        System.out.println("logging from the device");
    }
//    @Pointcut("execution(* get*())")
//    public void allGetters(){}
//    @Pointcut("within(com.example.springaop_demo.model.Circle)")
//    public void allCirclesMethods(){}
}
