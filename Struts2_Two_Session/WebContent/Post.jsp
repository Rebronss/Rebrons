<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>success</title>
</head>
<body>
<p>欢迎<s:property value="#session.LoginUser.userName"/>登录</p>

<div>
	<form action="message/message!addPost" method="post">
		<p>发帖人:<s:property value="#session.LoginUser.userName"/></p>
		<p>题目:</p>
		<input name="mtitle" type="text">
		<p>内容:</p>
		<!-- <input name="mpost" type="text"> -->
		<textarea name="mpost" rows="10" cols="30"></textarea>	
		<p></p>
		<input type="submit" value="提交">
	</form>
</div>
<s:debug></s:debug>
</body>
</html>