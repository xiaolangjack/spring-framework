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
public class ClassService {

	public void show() {
		System.out.println(".......................... classService Show () ..........................");
	}

	public void show(String name) {
		System.out.println(".......................... classService Show () .........................." + name);
	}

	public int opreation(int a, int b) {
		return a - b;
	}
}
