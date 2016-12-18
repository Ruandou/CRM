package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.bean.User;
import com.crm.service.UserService;

@Service @Transactional
public class UserServiceBean implements UserService {
	@Resource SessionFactory factory;

	@Override
	public void update(User user) {
		factory.getCurrentSession().merge(user);
	}

	@Override
	public User findById(String userId) {
		return (User)factory.getCurrentSession().get(User.class, userId);
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean login(String userId, String password) {
		List<User> users = factory.getCurrentSession().createQuery("from User").getResultList();
		for (User user : users) {
			if (user.getUserId().equals(userId) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return factory.getCurrentSession().createQuery("from User").getResultList();
	}
}
