package com.jack.ioc.model.config;

/**
 * Created By: yy
 * Created At: 2022/5/7 18:04
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

public class Hellow {
	private String key;

	public Hellow() {
	}

	public Hellow(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Hellow{" +
				"key='" + key + '\'' +
				'}';
	}
}
