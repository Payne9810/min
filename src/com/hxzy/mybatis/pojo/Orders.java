package com.hxzy.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable{

	private Integer id;
	private String userId;
	private String number;
	private Date createtime;
	private String note;
	
	private User user;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + ", user=" + user + "]";
	}
	
	
}
