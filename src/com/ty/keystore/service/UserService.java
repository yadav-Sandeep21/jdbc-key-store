package com.ty.keystore.service;

import com.ty.keystore.dao.UserDao;
import com.ty.keystore.dto.User;

public class UserService {
	UserDao userDao=new UserDao();
	public int saveUser(User user) {
		return userDao.saveUser(user);
	}
}
