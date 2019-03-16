package com.rebron.loginSession.dao;

import java.util.List;

import com.rebron.loginSession.domain.Message;
import com.rebron.loginSession.domain.User;

public interface MessageDao {

	boolean addPost(User user,Message message)throws Exception;

	List<Object> showMyPostById(User user)throws Exception;

}
