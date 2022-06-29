package com.jack.ioc.model;

/**
 * Created By: yy<lanqiu@deloitte.com.cn>
 * Created At: 2022/5/2 0:29
 * <p></p>
 */

public class Person {
	private String name;
	private String age;

	public Person() {
	}

	public Person(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
