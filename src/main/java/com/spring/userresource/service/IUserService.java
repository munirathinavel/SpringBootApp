package com.spring.userresource.service;

import com.spring.userresource.vo.User;

public interface IUserService {

	User createUser(User user);

	User updateUser(User user);

	User deleteUser(User user);

}
