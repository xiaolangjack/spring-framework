package com.jack.tm;

import com.jack.tm.config.ConfigForTM;
import com.jack.tm.models.User;
import com.jack.tm.service.DefaultUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 6/29/2022  12:01 PM
 * <p>
 */
public class MainTM {

	public static void main(String[] args) {

//		annotation();

//		xml();

		userList();

	}


	public static void userList(){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigForTM.class);
		DefaultUserService userService = ctx.getBean(DefaultUserService.class);
		List<User> user = userService.getUser();
		for (User item : user) {
			System.out.println(item);
		}
	}



	public static void annotation() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigForTM.class);
		DefaultUserService userService = ctx.getBean(DefaultUserService.class);
//		try {
//			userService.insertUser(new User("xiaolang8", "0", "0"));
//			userService.insertUser(new User("errorName", "0", "0"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		for (int i = 100; i < 1000; i++) {
			try {
				userService.insertUser(new User("xiaolang" + i, "" + i, "0"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	public static void xml() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tm/content.xml");
		DefaultUserService userService = context.getBean("userService", DefaultUserService.class);
		try {
			userService.insertUser(new User("xiaolang8", "0", "0"));
			userService.insertUser(new User("errorName", "0", "0"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
