package com.rebron.loginSession.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.rebron.loginSession.domain.User;
import com.rebron.loginSession.service.UserService;
import com.rebron.loginSession.service.serviceImpl.UserServiceImpl;

public class UserAtion extends ActionSupport implements ModelDriven<User>,SessionAware{

	private static final long serialVersionUID = -5388983155010866298L;	
	private User user = new User();	
	public  Map<String, Object> session ;
	public List<User> list;
	UserService UserService  = new UserServiceImpl(); 
	
	public User getModel() {		
		return user;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}	
	
	public Map<String, Object> getSession() {
		return session;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	
	
	
	public String login() throws Exception {
		System.out.println(user);
		User uu = UserService.login(user);
		if(null != uu) {
			System.out.println("coming login.......");
			//ActionContext.getContext().getSession().put("LoginUser", uu);			
			this.session.put("LoginUser", uu);
			System.out.println(session.get("LoginUser"));
			
			return SUCCESS;
		}else {
			return ERROR;
		}
		
	}

	public String searchUserAll() throws Exception{
		list = UserService.searchUserAll();
		System.out.println("Coming searchUserAll.......");
		if(list != null) {
			for (User user : list) {
				System.out.println(user);
			}
		}
		return SUCCESS;
	}





}
