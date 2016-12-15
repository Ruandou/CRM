<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="styles/login.css" />
		<title>Welcome</title>
	</head>
	<body>
		<form action="login" method="post" id="loginForm">
			<P>
				<label for="userId"><span>用户名：</span></label>
				<input type="text" id="userId" name="userId" />
			</P>
			<p>
				<label for="password"><span>密码：</span></label>
				<input type="password" id="password" name="password" />
			</p>
			<p class="button">
				<button type="submit">登录</button>
			</p>
		</form>
	</body>
</html>