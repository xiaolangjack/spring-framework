package com.jack.other.dynamic.proxy;

import com.jack.other.dynamic.proxy.cglib.CglibProxy;
import com.jack.other.dynamic.proxy.jdk.ProxyClass;
import com.jack.other.dynamic.proxy.service.UserService;
import com.jack.other.dynamic.proxy.service.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 7/19/2022  10:53 AM
 * <p>
 */
public class Main {
	public static void main(String[] args) {

//		jdk();
		cglib();

	}


	public static void cglib() {
		UserService userService = new UserServiceImpl();
		CglibProxy cglibProxy = new CglibProxy(userService);
		UserService proxy = (UserService) cglibProxy.getProxy();

		proxy.add(1, 2);
		proxy.show();


	}


	public static void jdk() {
		UserService userService = new UserServiceImpl();
		ProxyClass proxyClass = new ProxyClass(userService);

		UserService o = (UserService) Proxy.newProxyInstance(
				userService.getClass().getClassLoader(),
				userService.getClass().getInterfaces(),
				proxyClass
		);
		o.show();
		o.add(1, 2);
	}
}
