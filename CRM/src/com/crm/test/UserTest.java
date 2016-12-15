package com.crm.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crm.service.UserService;

public class UserTest {
	public static UserService userService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			userService = (UserService)context.getBean("userServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void save() {
		System.out.println(userService.getAll().size());
	}
}
