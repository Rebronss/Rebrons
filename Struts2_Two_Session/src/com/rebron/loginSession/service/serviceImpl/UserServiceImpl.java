package com.rebron.loginSession.service.serviceImpl;

import java.util.List;

import com.rebron.loginSession.dao.UserDao;
import com.rebron.loginSession.dao.daoImpl.UserDaoImpl;
import com.rebron.loginSession.domain.User;
import com.rebron.loginSession.service.UserService;

public class UserServiceImpl implements UserService {
	

	/**
	 * 用户登陆
	 */
	public User login(User user) throws Exception {
		UserDao UserDao = new UserDaoImpl();
		User user2 = null;
		user2 = UserDao.login(user);
		if(user2 == null) {
			System.out.println("user2 not is null");
		}else {
			System.out.println("user2 not null");
		}
		return user2;
	}

	/**
	 * 实现查询所有用户
	 */
	public List<User> searchUserAll() throws Exception {
		UserDao UserDao = new UserDaoImpl();
		List<User> list = UserDao.searchUserAll();
		return list;
	}

}
