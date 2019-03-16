package com.rebron.loginSession.domain;

import java.util.Date;

public class Message {
	private String mtitle;
	private String mpost;
	private Date writerDate;

	public String getMtitle() {
		return mtitle;
		
	}
	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}
	public String getMpost() {
		return mpost;
	}
	public void setMpost(String mpost) {
		this.mpost = mpost;
	}
	public Date getWriterDate() {		
		return writerDate;
	}
	public void setWriterDate(Date writerDate) {
		this.writerDate = writerDate;
	}
	
	public Message() {
		super();
	}
	public Message(String mtitle, String mpost, Date writerDate) {
		super();
		this.mtitle = mtitle;
		this.mpost = mpost;
		this.writerDate = writerDate;
	}
	@Override
	public String toString() {
		return "Message [mtitle=" + mtitle + ", mpost=" + mpost + ", writerDate=" + writerDate + "]";
	}
	
	
}
