package com.jack.model.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created By: yy
 * Created At: 2022/5/7 18:42
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

public class BeanTwo  implements InitializingBean, DisposableBean {


	public BeanTwo() {
	}

	public BeanTwo(String key) {
		this.key = key;
	}

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("BeanTwo afterPropertiesSet...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("BeanTwo destroy...");
	}


	@Override
	public String toString() {
		return super.toString();
	}
}
