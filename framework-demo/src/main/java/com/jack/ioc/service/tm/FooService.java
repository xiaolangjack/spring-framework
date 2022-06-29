package com.jack.ioc.service.tm;

import com.jack.ioc.model.tm.Foo;

public interface FooService {

	Foo getFoo(String fooName);

	Foo getFoo(String fooName, String barName);

	void insertFoo(Foo foo);

	void updateFoo(Foo foo);

}