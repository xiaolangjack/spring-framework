package com.jack.other.dynamic.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 7/19/2022  10:49 AM
 * <p>
 */
public class ProxyClass implements InvocationHandler {
	Object target;

	public ProxyClass(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy before-----");
		Object invoke = method.invoke(target, args);
		System.out.println("proxy after-----");
		return invoke;
	}


}
