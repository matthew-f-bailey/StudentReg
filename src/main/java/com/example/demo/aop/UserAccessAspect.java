package com.example.demo.aop;



import org.aspectj.lang.annotation.Aspect;

import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class UserAccessAspect {
/**
	
	
	
	@Before("execution(* com.example.demo.contoller.StudentController (..)")
	public void before(JoinPoint joinPoint){
		//Advice
		System.out.println(" Check for user access ");
		System.out.println(" Allowed execution for {}, " + joinPoint);
	}*/
}
	