package com.spring.userresource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.userresource.dao.IUserDao;
import com.spring.userresource.vo.User;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserDao userdao;

	@Override
	public User createUser(User user) {
		return userdao.createUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userdao.updateUser(user);
	}

	@Override
	public User deleteUser(User user) {
		return userdao.deleteUser(user);
	}

}
