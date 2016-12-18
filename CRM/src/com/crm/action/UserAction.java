package com.crm.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.crm.bean.User;
import com.crm.service.UserService;
import com.opensymphony.xwork2.ActionContext;

@Controller @Scope("prototype")
public class UserAction {
	@Resource UserService userService;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String login() {
		if (userService.login(user.getUserId(), user.getPassword())) {
			return "success";
		} else {
			ActionContext.getContext().put("message", "用户名或密码错误。");
			return "fail";
		}
	}
}
