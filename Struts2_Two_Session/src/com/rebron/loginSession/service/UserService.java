package com.rebron.loginSession.service;

import java.util.List;

import com.rebron.loginSession.domain.User;

public interface UserService {

	/**
	 * 用户登陆
	 * @param user
	 * @return
	 * @throws Exception
	 */
	User login(User user) throws Exception;
	/**
	 * 查询所有用户信息
	 * @return
	 * @throws Exception
	 */
	List<User> searchUserAll()throws Exception;

}
