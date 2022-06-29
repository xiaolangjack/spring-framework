package com.jack.ioc.model.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created By: yy
 * Created At: 2022/5/7 18:41
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

public class BeanOne {
	@Value("beanOne k")
	private String k;

	public void init() {
		// initialization logic
		System.out.println("BeanOne init()...");
	}

	public void cleanup() {
		System.out.println("BeanOne cleanup()...");
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
