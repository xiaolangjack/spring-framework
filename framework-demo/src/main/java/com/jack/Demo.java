package com.jack;

import com.jack.model.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By: yy<lanqiu@deloitte.com.cn>
 * Created At: 2022/5/2 0:15
 * <p></p>
 */

public class Demo {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		BeanDefinition person1 = context.getBeanFactory().getBeanDefinition("person");  impersonat
//		Person person = context.getBean("person", Person.class);
//		Person person1 = context.getBean("person", Person.class);
//		Person person3 = context.getBean("person2", Person.class);
		Person person4 = context.getBean("person2", Person.class);

	}

}
