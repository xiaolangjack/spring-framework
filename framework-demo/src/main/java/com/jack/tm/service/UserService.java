package com.jack.tm.service;


import com.jack.tm.models.User;

public interface UserService {

	User getFoo(String fooName);

	User getFoo(String fooName, String barName);

	void insertFoo(User foo);

	void updateFoo(User foo);

}