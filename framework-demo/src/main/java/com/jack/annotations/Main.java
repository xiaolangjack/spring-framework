package com.jack.annotations;

import com.jack.annotations.config.AnnotationConfig;
import com.jack.annotations.importselector.ServiceA;
import com.jack.annotations.importselector.ServiceB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 7/18/2022  5:07 PM
 * <p>
 */
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
		ServiceA bean = context.getBean(ServiceA.class);
		ServiceB beanb = context.getBean(ServiceB.class);
	}
}
