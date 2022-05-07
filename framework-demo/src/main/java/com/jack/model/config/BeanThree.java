package com.jack.model.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created By: yy
 * Created At: 2022/5/7 19:47
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p> custom BeanPostProcessor
 */

public class BeanThree implements BeanPostProcessor, FactoryBean {

	@Value("bean three value")
	private String value;
	// simply return the instantiated bean as-is
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		return bean; // we could potentially return any object reference here...
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("Bean '" + beanName + "' created : " + bean.toString());
		return bean;
	}

	@Override
	public BeanThree getObject() throws Exception {
		return new BeanThree();
	}

	@Override
	public Class<?> getObjectType() {
		return BeanThree.class;
	}
}
