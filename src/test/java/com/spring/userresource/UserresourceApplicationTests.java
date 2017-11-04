package com.spring.userresource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.userresource.dao.IUserDao;
import com.spring.userresource.vo.User;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = "com.spring.userresource")
@SpringBootTest
public class UserresourceApplicationTests {

	@Autowired
	IUserDao userDao;

	@Test
	public void createUser() {
		User user = new User();
		user.setfName("CM");
		user.setlName("Vel");
		user.setBirthDate("09-AR-2015");
		user.setPinCode(567897);
		user.setActive(true);

		userDao.createUser(user);

		Assert.assertEquals(user.getfName(), user.getfName());
	}

	@Test
	public void updateUser() {
		User user = new User();
		user.setfName("CM");
		user.setlName("Vel");
		user.setBirthDate("09-AR-2015");
		user.setPinCode(567897);
		user.setActive(true);

		User userUpdate = userDao.createUser(user);

		userUpdate.setPinCode(563456);

		User updatedUser = userDao.updateUser(userUpdate);

		Assert.assertEquals(userUpdate.getPinCode(), updatedUser.getPinCode());
	}

	@Test
	public void deleteUser() {

		User user = new User();
		user.setfName("CM");
		user.setlName("Vel");
		user.setBirthDate("09-AR-2015");
		user.setPinCode(567897);
		user.setActive(true);

		User toBeDeleted = userDao.createUser(user);

		user.setId(1);

		User userDeleted = userDao.deleteUser(user);

		Assert.assertEquals(userDeleted.getId(), toBeDeleted.getId());
	}

}
