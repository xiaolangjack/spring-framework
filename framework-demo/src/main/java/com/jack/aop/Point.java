package com.jack.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;

/**
 * Created By: yy
 * Created At: 2022/5/8 16:36
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

@Aspect
public class Point implements Ordered {

	@Pointcut("execution(* com.jack.service.Service.show())")
	public void pointCut(){
		System.out.println("PointCut ................. +++++++++++++++++++++++++++++++++++++++++++ ...... ");
	}

	@Around("com.jack.service.Service.UserService.show()")
	public Object doConcurrentOperation(){
		return "aaa";
	}

	@Override
	public int getOrder() {
		return 1;
	}
}
