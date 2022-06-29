package com.jack.ioc.config;

import com.jack.ioc.service.aop.Point;
import com.jack.ioc.service.aop.impl.ClassService;
import com.jack.ioc.service.aop.impl.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created By: yy
 * Created At: 2022/5/8 15:03
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectJAutoProxy {

	@Bean
	public Point point() {
		return new Point();
	}

	@Bean
	public ClassService classService() {
		return new ClassService();
	}

	@Bean
	public UserService userService() {
		return new UserService();
	}

}
