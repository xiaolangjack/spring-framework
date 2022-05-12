package com.jack.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created By: yy
 * Created At: 2022/5/8 16:36
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

@Aspect
@Component
public class Point {

	@Pointcut("execution(com.jack.service.impl.UserService.show())")
	private void pointCut(){
		System.out.println("PointCut ................. +++++++++++++++++++++++++++++++++++++++++++ ...... ");
	}


}
