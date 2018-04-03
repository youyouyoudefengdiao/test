package com.sakura.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.sakura.entity.User;
import com.sakura.service.UserService;

@Controller
public class UserAction {
	@Resource
	private UserService userService;
	public User login(User user)throws Exception{
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
