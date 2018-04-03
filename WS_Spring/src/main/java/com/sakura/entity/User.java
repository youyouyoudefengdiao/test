package com.sakura.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 用户类
 * @author sakula
 *
 */
@Entity
@Table(name="theuser")
public class User  {
	 private String password;
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer userID;
	
	  private String userName;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	 
}
