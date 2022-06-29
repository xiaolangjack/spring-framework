package com.jack.ioc.model.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created By: yy
 * Created At: 2022/5/7 18:42
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

@Component
public class BeanTwo implements InitializingBean, DisposableBean {


	public BeanTwo() {
	}

	public BeanTwo(String key) {
		this.key = key;
	}

	@Value("beanTwo Key")
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
