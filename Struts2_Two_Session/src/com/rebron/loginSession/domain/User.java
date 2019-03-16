package com.rebron.loginSession.domain;


public class User {
	private String userName;
	private String passWord;
	private int uid;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public User() {
		super();
		
	}
	public User(String userName, String passWord, int uid) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", uid=" + uid + "]";
	}
	
	
	
	
}
