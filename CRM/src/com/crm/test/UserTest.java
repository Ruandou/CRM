package com.crm.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crm.action.UserAction;
import com.crm.service.UserService;

public class UserTest {
	public static UserService userService;
	public static UserAction userAction;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			userService = (UserService)context.getBean("userServiceBean");
			userAction = (UserAction)context.getBean("userAction");
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void save() {
		System.out.println(userService.toString());
		System.out.println(userAction.toString());
		System.out.println(userService.getAll().size());
	}
}
