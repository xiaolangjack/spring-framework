package com.jack.ioc;

import com.jack.ioc.config.AppConfig;
import com.jack.ioc.config.AspectJAutoProxy;
import com.jack.ioc.model.Person;
import com.jack.ioc.model.config.BeanFour;
import com.jack.ioc.model.config.BeanOne;
import com.jack.ioc.model.config.BeanThree;
import com.jack.ioc.model.config.BeanTwo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By: yy<lanqiu@deloitte.com.cn>
 * Created At: 2022/5/2 0:15
 * <p></p>
 */

public class Demo {

	private final Log log = LogFactory.getLog(getClass());

	public static void main(String[] args) {

		// use XML to config bean
//		xmlConfig();
//		println();
		// use annotation to config bean
//		annotationConfig();
//		println();

		// profileAndScan
//		profileAndScan("");
//		println();
//		profileAndScan("dev");
//		println();
//		profileAndScan("prod");

//		ExpressionParser parser = new SpelExpressionParser();
//		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");
//		String message = exp.getValue(String.class);
//		System.out.println(message);

	}

	/**
	 * profileAndScan
	 */
	public static void profileAndScan(String profile) {
		AnnotationConfigApplicationContext context;
		if (profile.isEmpty()) {
			context = new AnnotationConfigApplicationContext(AspectJAutoProxy.class);
		} else {
			context = new AnnotationConfigApplicationContext();
			context.getEnvironment().setActiveProfiles(profile);
			context.register(AspectJAutoProxy.class);
			context.refresh();
		}
		System.out.println("profile " + profile + " start....");
		for (String activeProfile : context.getEnvironment().getActiveProfiles()) {
			System.out.println(activeProfile);
		}
		System.out.println("profile " + profile + " end....");
		println(100, "=");

	}

	/**
	 * use annotation to config bean
	 */
	public static void annotationConfig() {

		// use annotation to config bean
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
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
	public static void xmlConfig() {
		// use XML to config bean
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Person person = context.getBean("person", Person.class);
		Person person1 = context.getBean("person", Person.class);
		Person person3 = context.getBean("person2", Person.class);
		Person person4 = context.getBean("person2", Person.class);
		context.close();
	}


	// ============================================
	//
	// Next function is tool for print placeholder
	//
	// ============================================
	static void println(Integer integer) {
		println(integer, "-");
	}

	static void println(String sharp) {
		println(100, sharp);
	}

	static void println() {
		println(100, "-");
	}

	static void println(Integer length, String sharp) {
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.print(sharp);
			}
		}
		System.out.println();
	}

}
