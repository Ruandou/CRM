package com.crm.service;

import java.util.List;

import com.crm.bean.User;

public interface UserService {
	public void update(User user);
	public User findById(String userId);
	public boolean login(String userId, String password);
	public List<User> getAll();
}
