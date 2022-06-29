package com.jack.tm.models;

import org.springframework.stereotype.Component;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 6/29/2022  12:01 PM
 * <p>
 */

public class User {

	public User() {
	}

	public User(String name, String age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	private String name;

	private String age;

	private String sex;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
