package com.jack.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspects {

	@Pointcut("execution(public * com.jack.aop.service.impl.*Service.*(..))")
	public void pointCut() {
	}

//	@Before("pointCut()")
//	public void logStart(JoinPoint joinPoint) {
//		Object[] args = joinPoint.getArgs();
//		System.out.println("" + joinPoint.getSignature().getName() + " Running ... @Before:Param List is : {" + Arrays.asList(args) + "}");
//	}

//	@After("com.jack.aop.aspects.LogAspects.pointCut()")
//	public void logEnd(JoinPoint joinPoint) {
//		System.out.println("" + joinPoint.getSignature().getName() + " Finished ... @After");
//	}

	@Around("com.jack.aop.aspects.LogAspects.pointCut()")
	public Object around(ProceedingJoinPoint joinPoin) {
		System.out.println("around.......");
		Object proceed = null;
		try {
			proceed = joinPoin.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return proceed;
	}

	@AfterReturning(value = "pointCut()", returning = "result")
	public void logReturn(JoinPoint joinPoint, Object result) {
		System.out.println("" + joinPoint.getSignature().getName() + " Return ... @AfterReturning:{" + result + "}");
	}

	@AfterThrowing(value = "pointCut()", throwing = "exception")
	public void logException(JoinPoint joinPoint, Exception exception) {
		System.out.println("" + joinPoint.getSignature().getName() + " Exception ... infomation is : {" + exception + "}");
	}

}