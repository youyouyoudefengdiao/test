package com.sakura.webservice;

import javax.jws.WebService;


import com.sakura.entity.User;

/**
 * 用户登录，检查用户名及密码是否正确
 * @author sakula
 *
 */
@WebService
public interface UserLogin {
	public User login(User user);

}
