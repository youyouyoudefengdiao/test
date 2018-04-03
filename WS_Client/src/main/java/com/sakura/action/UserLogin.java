package com.sakura.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sakura.webservice.User;
import com.sakura.webservice.impl.UserLoginImplService;

/* * 用户登录
 * @author sakula
 *
 */
public class UserLogin extends ActionSupport {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String username;//用户名
	private String password;//密码

	/**
	 * 判断根据用户名判断用户是否存在
	 * 
	 * @return 
	 * SUCCESS username与password均不为空且填写正确  
	 * ERROR username为空或password为空或用户不存在或用户存在但输入密码错误
	 */
	public String userLogin() {
		if (!(username.isEmpty() && password.isEmpty())) {
			/* ----------与服务器端连接-------------------- */
			UserLoginImplService service = new UserLoginImplService();
			com.sakura.webservice.UserLogin userLogin = service.getUserLoginImplPort();
			/* ------------------------------------------ */
			User user = new User();
			user.setPassword(password);
			user.setUserName(username);
			//login为服务器端提供方法，返回一个User，如果用户名不存在，返回的UserID为-1
			User user1 = userLogin.login(user);
			if (user1.getUserID() >= 0 && password.equals(user1.getPassword()))
				return SUCCESS;
		}
		return ERROR;
	}
/* ------------------------------------getter/setter---------------------------------------------------------- */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
