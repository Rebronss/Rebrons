package com.rebron.loginSession.service.serviceImpl;

import java.util.List;

import com.rebron.loginSession.dao.MessageDao;
import com.rebron.loginSession.dao.daoImpl.MessageDaoImpl;
import com.rebron.loginSession.domain.Message;
import com.rebron.loginSession.domain.User;
import com.rebron.loginSession.service.MessageService;

public class MessageServiceImpl implements MessageService {
	/**
	 * 调用dao层MessageDao中addPost方法，实现发帖功能
	 */
	public boolean addPost(User user,Message message) throws Exception {
		MessageDao MessageDao = new MessageDaoImpl();
		boolean flag = MessageDao.addPost(user,message);
		return flag;
	}


	public List<Object> showMyPostById(User user) throws Exception {
		MessageDao MessageDao = new MessageDaoImpl();
		List<Object> messageList = MessageDao.showMyPostById(user);
		return messageList;
	}

}
