package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Before advice applied to every method of StudentService
    @Before("execution(* com.example.demo.service.StudentService.*(..))")
    public void logBeforeMethodCall(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[AOP-BEFORE] Intercepting execution route! Triggering before: " + methodName);
    }
}
