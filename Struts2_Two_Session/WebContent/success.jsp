<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>success</title>
</head>
<body>
<p>欢迎<s:property value="#session.LoginUser.userName"/>登录</p>

<div>
	<ul>
		<li><a href="<s:url action="searchUserAll!searchUserAll"/>">显示所有用户信息</a></li>
		<li><a href="<%=basePath%>/Post.jsp">发帖</a></li>
		<li><a href="<s:url action="message/showPost!showMyPostById"/>">查看我的帖子</a></li>
	</ul>
</div>
<!-- <iframe src="http://www.baidu.com" width="600" height="500"></iframe> -->
<s:debug></s:debug>
</body>
</html>