package com.rebron.loginSession.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.rebron.loginSession.domain.Message;
import com.rebron.loginSession.domain.User;
import com.rebron.loginSession.service.MessageService;
import com.rebron.loginSession.service.serviceImpl.MessageServiceImpl;

public class MessageAtion extends ActionSupport implements ModelDriven<Message>,SessionAware{
	

	private static final long serialVersionUID = 1L;
	public  Map<String, Object> session;
	private Message message = new Message();
	public Message getModel() {
		return message;
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}		
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * 实现发帖功能
	 * @return
	 * @throws Exception
	 */
	public String addPost() throws Exception{
		MessageService MessageService = new MessageServiceImpl();
		User user = (User)this.session.get("LoginUser");
		boolean flag = MessageService.addPost(user,message);
		if(flag == true) {
			System.out.println("发帖成功");
			return SUCCESS;
		}else {
			System.out.println("发帖失败");
			return ERROR;
		}
		
	}
	/**
	 * 通过用户id查询该用户所有的发帖
	 * @return
	 * @throws Exception
	 */
	public String showMyPostById() throws Exception{
		MessageService MessageService = new MessageServiceImpl();
		User user = (User)session.get("LoginUser");		
		List<Object> messageList = MessageService.showMyPostById(user);		
		if(message != null) {
			System.out.println("发帖信息不为空");
			session.put("MessageList",messageList );
			System.out.println(messageList.toString());
			return SUCCESS;
		}else {
			System.out.println("发帖信息为空");
			return ERROR;
		}
	
	}
	
	public String replyToPost() throws Exception{
		return null;
	}
	

}
