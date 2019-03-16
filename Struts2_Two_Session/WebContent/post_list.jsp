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
<title>我的帖子</title>
</head>
<body>
<p>欢迎<s:property value="#session.LoginUser.userName"/>登录</p>

<div>
	<table border="1" height="200px" width="500px">
  <tr>
    <th>标题</th>
    <th>内容</th>
    <th>发帖人</th>
  </tr>
  
  <tr>
  	<s:iterator value="#session.MessageList" var="p">
	    <td><s:property value="#p.mtitle"/></td>  
	    <td><s:property value="#p.mpost"/></td>
	    <td><s:property value="#session.LoginUser.userName"/></td>
    </s:iterator>
  </tr>
 
</table>
</div>
<s:debug></s:debug>
</body>
</html>