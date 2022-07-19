package com.jack.other.dynamic.proxy.service.impl;

import com.jack.other.dynamic.proxy.service.UserService;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 7/19/2022  10:48 AM
 * <p>
 */
public class UserServiceImpl implements UserService {
	@Override
	public void show() {
		System.out.println("userServiceImpl show()");
	}

	@Override
	public int add(Integer a, Integer b) {
		System.out.println(a+b);
		return a + b;
	}
}
