package com.jack.tm.service;

import com.jack.tm.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class DefaultUserService {

	private JdbcTemplate jdbcTemplate;

	public DefaultUserService() {
	}

	@Autowired
	public DefaultUserService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<User> getUser() {
		return this.jdbcTemplate.queryForList("select * from user where `id`> ?", User.class, "450");
	}

	@Transactional(rollbackFor = Exception.class)
	public void insertUser(User user) throws Exception {

		this.jdbcTemplate.update(
				"insert into user (name, age, sex) values (?, ?, ?)",
				user.getName(), user.getAge(), user.getSex());
		if ("errorName".equals(user.getName())) {
			throw new Exception("User Name is validated");
		}
	}

}