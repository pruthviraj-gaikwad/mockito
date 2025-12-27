package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());


    // Run this BEFORE any method in the data package
    @Before("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutconfig.allPackageConfigUsingBean()")
    public void logMethodCallBefore(JoinPoint joinPoint) {
        logger.info("Before Aspect - {} Method is called with arg:{}"
        		, joinPoint,joinPoint.getArgs());
                
    }
    
    @After("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutconfig.bussinessPackageConfig()")
    public void logMethodCallAfter(JoinPoint joinPoint) {
        logger.info("After Aspect - {} has executed,"
        		, joinPoint);
                
    }
    
    @AfterThrowing(
    		pointcut = "execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))",
    		throwing = "exception"
    )
    public void logMethodCallAfterExecution(JoinPoint joinPoint,Exception exception) {
        logger.info("AfterThrowing Aspect - {} has thrown an Exception {}"
        		, joinPoint,exception);
                
    }
    
    @AfterReturning(
    		pointcut = "com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutconfig.dataPackageConfig()",
    		returning = "resultValue"
    )
    public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint,Object resultValue) {
        logger.info("AfterReturning Aspect - {} has returned {}"
        		, joinPoint,resultValue);
                
    }
}
