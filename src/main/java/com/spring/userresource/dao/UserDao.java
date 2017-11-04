package com.spring.userresource.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.userresource.util.GenerateUniqueSequence;
import com.spring.userresource.vo.User;

@Repository
public class UserDao implements IUserDao {
	private Map<Integer, User> userStore = new HashMap<>();

	/**
	 * This method is used to create new User object & store into userStore Map
	 */
	@Override
	public User createUser(User user) {
		user.setId(GenerateUniqueSequence.generateUniqueId());

		userStore.put(user.getId(), user);

		System.out.println("User Created Succssfully");

		return user;
	}

	/**
	 * This method is used to update existing User object & store into userStore
	 * Map
	 */
	@Override
	public User updateUser(User user) {
		User toBeUpdated = userStore.get(user.getId());
		if (toBeUpdated == null) {
			throw new RuntimeException("User Not Found!");
		}
		toBeUpdated.setBirthDate(user.getBirthDate());
		toBeUpdated.setPinCode(user.getPinCode());
		userStore.put(user.getId(), toBeUpdated);

		System.out.println("User Updated Succssfully");
		return toBeUpdated;
	}

	/**
	 * This method is used to delete User object from userStore Map
	 */
	@Override
	public User deleteUser(User user) {
		User toBeDeleted = userStore.get(user.getId());
		if (toBeDeleted == null) {
			throw new RuntimeException("User Not Found!");
		}
		toBeDeleted.setActive(false);
		userStore.put(user.getId(), toBeDeleted);
		System.out.println("User Deleted Succssfully");
		return toBeDeleted;
	}

}
