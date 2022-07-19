package com.jack.other.dynamic.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
   @author lanqiu: lanqiu@deloitte.com.cn
   Created At: 7/19/2022  11:37 AM
   <p>
*/
public class CglibProxy implements MethodInterceptor {

	private Object target;

	public CglibProxy(Object target) {
		this.target = target;
	}

	public Object getProxy(){

		Enhancer enhancer=new Enhancer();

		enhancer.setSuperclass(target.getClass());

		enhancer.setCallback(this);

		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println(".... cglib proxy before ....");
		Object invoke = method.invoke(target, args);
		System.out.println(".... cglib proxy after ....");
		return invoke;
	}
}
