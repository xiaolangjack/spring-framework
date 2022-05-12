package com.jack.config;

import org.springframework.context.annotation.ComponentScan;
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
//@ComponentScan(basePackages = {"com.jack.service"})
@EnableAspectJAutoProxy()
public class AspectJAutoProxy {

}
