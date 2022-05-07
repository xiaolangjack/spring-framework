package com.jack.config;

import com.jack.model.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created By: yy
 * Created At: 2022/5/7 18:01
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

@Configuration
public class AppConfig {

	@Bean(
			initMethod = "init",
			destroyMethod = "cleanup"
	)
	public BeanOne beanOne(){
		return new BeanOne();
	}

	@Bean
	public BeanTwo beanTwo() {
		return new BeanTwo("This is beanTwo class key");
	}

	@Bean
	public BeanThree beanThree() {
		return new BeanThree();
	}

	@Bean
	public BeanFour beanFour(){
		return new BeanFour();
	}

}
