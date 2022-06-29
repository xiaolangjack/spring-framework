package com.jack.ioc.service.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * Created By: yy
 * Created At: 2022/5/8 16:36
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */
@Aspect
public class Point {

	@Pointcut("execution(public * com.jack.ioc.service.aop.impl.ClassService.*(..))")
//	@Pointcut("execution(public * com.jack.aop.service.impl.*Service.*(..))")
	private void pointCut11() {

	}

	@Before("pointCut11()")
	public void logStart(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		System.out.println("" + joinPoint.getSignature().getName() + " Running ... @Before:Param List is : {" + Arrays.asList(args) + "}");
	}

	@After("com.jack.ioc.service.aop.Point.pointCut11()")
	public void logEnd(JoinPoint joinPoint) {
		System.out.println("" + joinPoint.getSignature().getName() + " Finished ... @After");
	}

//	@Around("pointCut11()")
//	public Object around(ProceedingJoinPoint joinPoin) {
//		System.out.println("go go go MyAspectJ process!!!");
//		Object obj = null;
//		try {
//			obj = joinPoin.proceed();
//		} catch (Throwable throwable) {
//			throwable.printStackTrace();
//		}
//		System.out.println("PointCut ................. +++++++++++++++++++++++++++++++++++++++++++ ...... ");
//
//		return obj;
//	}


}
