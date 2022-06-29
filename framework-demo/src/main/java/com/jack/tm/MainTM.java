package com.jack.tm;

import com.jack.tm.config.ConfigForTM;
import com.jack.tm.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 6/29/2022  12:01 PM
 * <p>
 */
public class MainTM {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigForTM.class);
		User user = ctx.getBean("user", User.class);
		String name = user.getName();
	}
}
