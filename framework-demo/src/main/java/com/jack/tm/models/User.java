package com.jack.tm.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author lanqiu: lanqiu@deloitte.com.cn
 * Created At: 6/29/2022  12:01 PM
 * <p>
 */

@Component
@Data
@Setter
@Getter
public class User {
	private String name;
	private String age;
}
