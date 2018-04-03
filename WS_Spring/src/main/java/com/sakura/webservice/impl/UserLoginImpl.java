package com.sakura.webservice.impl;
import javax.annotation.Resource;
import javax.jws.WebService;
import org.springframework.stereotype.Component;
import com.sakura.entity.User;
import com.sakura.service.UserService;
import com.sakura.webservice.UserLogin;
@Component("userLogin")
@WebService
public class UserLoginImpl implements UserLogin{
	@Resource
	private UserService userService;
	public User login(User user){
		User currentUser=userService.findUserByNameAndPassword(user);
		if(currentUser!=null){
			return currentUser;
		}else{
			currentUser=new User();
			currentUser.setUserID(-1);
			return currentUser;
		}
	}
	

}
