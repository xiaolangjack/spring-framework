package com.jack.tm.service;


import com.jack.tm.models.User;

public class DefaultUserService implements UserService {

	@Override
	public User getFoo(String fooName) {
		System.out.println("get User");
		return new User();
	}

	@Override
	public User getFoo(String fooName, String barName) {
		System.out.println("get User");
		return new User();
	}

	@Override
	public void insertFoo(User foo) {
		System.out.println("insert User");
	}

	@Override
	public void updateFoo(User foo) {
		System.out.println("update User");
	}
}