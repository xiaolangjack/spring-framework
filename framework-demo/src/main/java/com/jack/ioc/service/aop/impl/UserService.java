package com.jack.ioc.service.aop.impl;

import org.springframework.stereotype.Component;

/**
 * Created By: yy
 * Created At: 2022/5/8 17:01
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */
@Component
public class UserService {

	public void show() {
		System.out.println(".......................... userService Show () ..........................");
	}
}
