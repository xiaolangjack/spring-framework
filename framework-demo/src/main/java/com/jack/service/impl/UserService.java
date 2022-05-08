package com.jack.service.impl;

import com.jack.service.Service;
import org.springframework.stereotype.Component;

/**
 * Created By: yy
 * Created At: 2022/5/8 17:01
 *
 * @author: yy <lanqiu@deloitte.com.cn>
 * <p>
 */
@Component
public class UserService implements Service {

	@Override
	public void show() {
		System.out.println(".......................... userService Show () ..........................");
	}
}
