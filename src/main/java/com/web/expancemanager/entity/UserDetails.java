package com.web.expancemanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	@Column(name="user_name")
	private String fullName;
	@Column(name="Phone_Number")
	private String phoneNumber;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String userPwd;
	
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", userName="
				+ userName + ", userPwd=" + userPwd + "]";
	}
	
	
	
	
	
}
