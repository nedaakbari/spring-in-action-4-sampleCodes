package org.example.aspect.concert;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class Audience {
    @Pointcut("execution(** org.example.aspect.concert.Performance.perform(..))")//Define named pointcut
    public void performance() {
        //The body of the performance() method is irrelevant and, in fact, should be empty
        //The method itself is just a marker
    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }


/////////////////////////////////////////or like this
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}

//    @Before("execution(** org.example.aspect.concert.Performance.perform(..))")//Before performance
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//
//    @Before("execution(** concert.Performance.perform(..))")
//    public void takeSeats() {
//        System.out.println("Taking seats");
//    }
//
//    @AfterReturning("execution(** concert.Performance.perform(..))")
//    public void applause() {
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//
//    @AfterThrowing("execution(** concert.Performance.perform(..))")//After bad performance
//    public void demandRefund() {
//        System.out.println("Demanding a refund");
//    }
//}