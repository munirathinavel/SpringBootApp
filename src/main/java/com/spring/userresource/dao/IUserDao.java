package com.spring.userresource.dao;

import com.spring.userresource.vo.User;

public interface IUserDao {
	User createUser(User user);

	User updateUser(User user);

	User deleteUser(User user);

}
