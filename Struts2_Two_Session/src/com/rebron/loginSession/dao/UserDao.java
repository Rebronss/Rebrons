package com.rebron.loginSession.dao;

import java.util.List;

import com.rebron.loginSession.domain.User;

public interface UserDao {
	/**
	 * 用户登录
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
