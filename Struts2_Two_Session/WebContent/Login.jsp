<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login</title>
</head>
<body>
	<form action="user/Login!login" method="post">
		<h1>登录</h1>
		<p>请输入您的用户名:</p>
		<input name="userName" type="text">
		<p>密码：</p>
		<input name="passWord" type="password">
		<p></p>
		<input type="submit" value="提交">
	</form>
	
</body>
</html>