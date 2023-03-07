package com.bptn.FeedApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bptn.FeedApplication.jdbc.UserBean;
import com.bptn.FeedApplication.jdbc.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public List<UserBean> listUsers() {
		
		return this.userDao.listUsers();
		
		
	}
	
	public UserBean findByUsername(String username) {
		
		return this.userDao.findByUsername(username);
	}
	
	public void createUser(UserBean user) {
		
		this.userDao.createUser(user);
	}
	
	
}