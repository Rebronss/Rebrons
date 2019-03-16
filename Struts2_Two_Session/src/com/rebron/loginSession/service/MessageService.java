package com.rebron.loginSession.service;

import java.util.List;

import com.rebron.loginSession.domain.Message;
import com.rebron.loginSession.domain.User;

public interface MessageService {

	boolean addPost(User user,Message message) throws Exception;

	List<Object> showMyPostById(User user)throws Exception;

}
