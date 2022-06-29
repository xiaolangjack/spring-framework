package com.jack.ioc.service.tm;

import com.jack.ioc.model.tm.Foo;

public class DefaultFooService implements FooService {

	@Override
	public Foo getFoo(String fooName) {
		System.out.println("get Foo");
		return new Foo();
	}

	@Override
	public Foo getFoo(String fooName, String barName) {
		System.out.println("get Foo");
		return new Foo();
	}

	@Override
	public void insertFoo(Foo foo) {
		System.out.println("insert Foo");
	}

	@Override
	public void updateFoo(Foo foo) {
		System.out.println("update Foo");
	}
}