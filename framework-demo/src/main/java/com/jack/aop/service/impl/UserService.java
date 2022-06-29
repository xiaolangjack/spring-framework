package com.jack.aop.service.impl;

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


	public void show(String name) {
		System.out.println(".......................... userService Show () .........................." + name);
	}

	public int opreation(int a, int b) throws Exception {
		if (a + b > 10) {
			throw new Exception("Error Operation");
		}
		return a + b;
	}
}
