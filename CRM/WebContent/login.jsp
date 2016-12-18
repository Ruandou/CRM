<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" media="screen" href="styles/base.css" />
        <link rel="stylesheet" media="screen" href="styles/login.css" />
        <title>Customer list</title>
    </head>
    <body>
        <div class="header">
            <header>
                <div class="header-content">
                    <div class="header-logo"><span>CRM</span></div>
                </div>
            </header>
        </div>
        <div class="content">
			<form action="login" method="post" id="loginForm">
				<P>
					<label for="userId"><span>*用户名：</span></label>
					<input type="text" id="userId" name="user.userId" />
				</P>
				<p>
					<label for="password"><span>*密码：</span></label>
					<input type="password" id="password" name="user.password" />
				</p>
				<p class="tip">
					<span>${message}</span>
				</p>
				<p class="button">
					<button type="submit">登录</button>
				</p>
			</form>
		</div>
        <div class="footer">
            <footer>
                <div>copy right&copy</div>
            </footer>
        </div>
	</body>
</html>