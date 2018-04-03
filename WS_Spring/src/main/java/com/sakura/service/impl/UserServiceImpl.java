package com.sakura.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sakura.dao.BaseDao;
import com.sakura.entity.User;
import com.sakura.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private BaseDao<User> baseDao;
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		baseDao.save(user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		baseDao.update(user);
	}

	public User findUserById(int id) {
		return baseDao.get(User.class, id);
	}

	public void deleteUser(User user) {
		baseDao.delete(user);
	}

	public List<User> findAllList() {
		return baseDao.find("from User");
	}

	public User findUserByNameAndPassword(User user) {
		return baseDao.get("from User u where u.userName=? and u.password=?", new Object[]{user.getUserName(),user.getPassword()});
	}

}
