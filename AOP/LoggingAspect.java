package com.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;



@Aspect
public class LoggingAspect {

 //   @Pointcut("execution(* com.AOP.Employee.showById(..))")
 //   public void showById(){};

   //@Before("showById()")
    @Before("execution(* com.AOP.Employee.showById(..))")
    public void taskBeforeShowing(JoinPoint joinPoint){
        System.out.println("Executing @Before");
    }

    @After("execution(* com.AOP.Employee.showById(..))")
    public void taskAfterShowing(JoinPoint joinPoint){
        System.out.println("Executing @After");
    }
    @AfterReturning("execution(* com.AOP.Employee.showById(..))")
    public void taskOnReturn(JoinPoint joinPoint){
        System.out.println("Value Returned");
    }
    @AfterThrowing("execution(* com.AOP.Employee.showById(..))")
            public void taskOnException(JoinPoint joinPoint)
    {
        System.out.println("Exception Caught");
    }
    @Around("execution(* com.AOP.Employee.showById(..))")
    public Object beforeAndAfter(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before running showByID()");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("After running showById() Return Value = "+value);
        return value;
    }
}

