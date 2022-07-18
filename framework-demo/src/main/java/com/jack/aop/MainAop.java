package com.jack.aop;

import com.jack.aop.config.MainConfigOfAOP;
import com.jack.aop.service.LoginService;
import com.jack.aop.service.impl.ClassService;
import com.jack.aop.service.impl.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 6/29/2022  10:34 AM
 * <p>
 */
public class MainAop {

	public static void main(String[] args) {
//		aop();

		source();

	}

	public static void source(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
		LoginService bean = ctx.getBean(LoginService.class);
		ClassService classService = ctx.getBean(ClassService.class);
		classService.show("classService");
	}


	public static void aop(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
		UserService userService = ctx.getBean(UserService.class);
		ClassService classService = ctx.getBean(ClassService.class);
		System.out.println("=============================== userService show() ================================================");
		userService.show("UserService");
		System.out.println("=============================== userService opreation() ================================================");
		try {
			userService.opreation(10, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("=============================== ClassService show() ================================================");
		classService.show("ClassService");

		System.out.println("=============================== ClassService opreation() ================================================");
		classService.opreation(10, 5);

		System.out.println("=============================== finished ================================================");

		ctx.close();
	}
}
