package com.jack;

import com.jack.config.AppConfig;
import com.jack.model.Person;
import com.jack.model.config.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By: yy<lanqiu@deloitte.com.cn>
 * Created At: 2022/5/2 0:15
 * <p></p>
 */

public class Demo {


	public static void main(String[] args) {

		// use XML to config bean
//		xmlConfig();

		// use annotation to config bean
		annotationConfig();


	}

	/**
	 * use annotation to config bean
	 */
	public static void annotationConfig(){
		// use annotation to config bean
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Hellow hellow = context.getBean("hellow", Hellow.class);
		BeanOne beanOne = context.getBean("beanOne", BeanOne.class);
		BeanTwo beanTwo = context.getBean("beanTwo", BeanTwo.class);
		BeanThree beanThree1 = context.getBean("&beanThree", BeanThree.class);
		BeanThree beanThree1_1 = context.getBean("&beanThree", BeanThree.class);
		BeanThree beanThree2 = context.getBean("beanThree", BeanThree.class);
		BeanThree beanThree2_1 = context.getBean("beanThree", BeanThree.class);
		BeanFour beanFour = context.getBean("beanFour", BeanFour.class);

		context.close();
	}

	/**
	 * use XML to config bean
	 */
	public static void xmlConfig(){
		// use XML to config bean
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Person person = context.getBean("person", Person.class);
		Person person1 = context.getBean("person", Person.class);
		Person person3 = context.getBean("person2", Person.class);
		Person person4 = context.getBean("person2", Person.class);
		context.close();
	}

}
