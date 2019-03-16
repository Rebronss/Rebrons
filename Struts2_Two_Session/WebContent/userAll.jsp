<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>allUser</title>
</head>
<body>
<div>
	 <p>欢迎<s:property value="#session.LoginUser.userName"/>登录</p>
	 <ul>
	 	<li><s:iterator value="list" var="u" >
	 		 <p>您的id是：<s:property value="#u.uid" />
	 		 	您的用户名是：<s:property value="#u.userName" />
	 		 	 <a href="#">修改</a>
	 		 </p>
	 		
	 		 <hr>
	 	</s:iterator></li>
	 	
	 </ul>
</div>
</body>
</html>