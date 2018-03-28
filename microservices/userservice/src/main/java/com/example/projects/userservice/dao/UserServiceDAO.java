package com.example.projects.userservice.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.projects.userservice.model.Users;

@Repository
public class UserServiceDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	private final static String SQL_SELECT_USERS = "SELECT ID, NAME, EMAILID FROM USERS";

	public List<Users> getUsersList() {
		Collection<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL_SELECT_USERS);
		List<Users> usersList = new ArrayList<>();
		rows.stream().map((row) -> {
			Users user = new Users();
			user.setId(String.valueOf(row.get("ID")));
			user.setName((String) row.get("NAME"));
			user.setEmailid((String) row.get("EMAILID"));
			return user;
		}).forEach((userObj) -> {
			usersList.add(userObj);
		});
		return usersList;
	}
}