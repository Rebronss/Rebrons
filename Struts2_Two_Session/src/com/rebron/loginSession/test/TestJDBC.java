package com.rebron.loginSession.test;

import org.junit.Test;

import com.rebron.loginSession.dao.UserDao;
import com.rebron.loginSession.dao.daoImpl.UserDaoImpl;

public class TestJDBC  {
	@Test
	public void testQuery() {
		//面向接口编程
		UserDao dao = new UserDaoImpl();
		
	}
	

}
