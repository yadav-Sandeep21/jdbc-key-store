package com.ty.keystore.controller;

import com.ty.keystore.dto.User;
import com.ty.keystore.service.UserService;

public class TestUser {

	public static void main(String[] args) {
		UserService userService=new UserService();
		User user=new User();
		user.setUid(1);
		user.setUser_name("sandeep");
		user.setEmail("san@mail.com");
		user.setPassword("12345");
		
		int res=userService.saveUser(user);
		if(res>0) 
			System.out.println("User saved");
			else
			System.out.println("Not Saved");
	}

}
