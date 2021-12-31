package com.example.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Helpdesk {

   @Before("execution(public * shown(String,..))")
    public void log(){

       System.out.println("Before calling shown parameter");
    }
    //OUTPUT
    //inside show
    //Before calling shown parameter
    //Inside Shown parameter
    @After("execution(public void show*())")
    public void afterLog(){

        System.out.println("After calling show [show*()]");
    }
    //OUTPUT
    //inside show
    //After calling show [show*()]
    //Inside Shown parameter

   @Pointcut("execution(public void show())")
    public void pointcut(){
    }
    @Before("pointcut()")
    public void beforeLog(){

        System.out.println("Before function execution");
    }
    @After("pointcut()")
    public void afterLog(){

       System.out.println("After function execution");
    }
    //OUTPUT
    //Before function execution
    //inside show
    //After function execution
    //Inside Shown parameter

    @AfterReturning("execution(public * show())")
    public void logAfterReturning()   {

        System.out.println("After Returning exception in method ");

    }
    //OUTPUT
    //inside show
    //After Returning exception in method
    //Inside Shown parameter

   @AfterThrowing("execution(public * show())")
     public void logAfterThrowing() {
        System.out.println("After Throwing exception in method ");

    }
    //OUTPUT
    //inside show
    //Inside Shown parameter

   @Around("pointcut()")
    public void aroundLog(){
        System.out.println("Around function");
    }
    //OUTPUT
    //Around function
    //Inside Shown parameter

  @Around("pointcut()")
    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before around");
        proceedingJoinPoint.proceed();
        System.out.println("after around");
    }
    //OUTPUT
    //before around
    //inside show
    //after around
    //Inside Shown parameter

}
