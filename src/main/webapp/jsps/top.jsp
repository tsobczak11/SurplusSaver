<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>top</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {
		/*TODO: 2. Change the color of the top part of the main page from dark blue to any other color.*/
		/*background: #4682B4;*/
		background: #FFFF00
	}
	a {
		text-transform:none;
		text-decoration:none;
	} 
	a:hover {
		text-decoration:underline;
	}
</style>
  </head>
  
  <body>
<!-- TODO: 3. Change the title of the main page from "CS480 | Database Systems" to your name -->
<!-- <h1 style="text-align: center;">CS 480 | Database System</h1> -->
<!-- Thomas Sobczak = farm and order entities -->
<h1 style="text-align: center;">CS 480 | surplus_saver</h1>
<div style="font-size: 10pt;">
	<c:choose>
		<c:when test="${empty sessionScope.session_user }">
			<a href="<c:url value='/jsps/user/login.jsp'/>" target="_parent">Login</a> |&nbsp; 
			<a href="<c:url value='/jsps/user/regist.jsp'/>" target="_parent">Register</a> |&nbsp;
			<a href="<c:url value='/jsps/farm/farm_menu.jsp'/>" target="body">CRUD farm</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/order/order_menu.jsp'/>" target="body">CRUD order</a> |&nbsp;&nbsp;
	
		</c:when>
		<c:otherwise>
			Hello：${sessionScope.session_user.username };
			<a href="<c:url value='/jsps/user/queries.jsp'/>" target="body">Query Result</a> |&nbsp;&nbsp;
			<a href="<c:url value='/UserServletLogout'/>" target="_parent">Logout</a> |&nbsp; 
			<a href="<c:url value='/jsps/farm/farm_menu.jsp'/>" target="body">CRUD farm</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/order/order_menu.jsp'/>" target="body">CRUD order</a> |&nbsp;&nbsp;

		</c:otherwise>
	</c:choose>

</div>
  </body>
</html>

