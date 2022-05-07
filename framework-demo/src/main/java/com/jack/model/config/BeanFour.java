package com.jack.model.config;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created By: yy
 * Created At: 2022/5/7 23:24
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */

public class BeanFour {

	@Autowired
	private BeanOne beanOne;

	private BeanTwo beanTwo;

	public BeanFour() {
	}


	@Autowired
	public void setBeanTwo(BeanTwo beanTwo) {
		this.beanTwo = beanTwo;
	}

	public BeanOne getBeanOne() {
		return beanOne;
	}

	@Override
	public String toString() {
		return "BeanFour{" +
				"beanOne=" + beanOne +
				", beanTwo=" + beanTwo +
				'}';
	}
}
