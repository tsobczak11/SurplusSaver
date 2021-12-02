<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>Create a recipient</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
</head>
<body>
	  <h1>Create a recipient</h1>
	<form action="<c:url value='/Entity1ServletCreate'/>" method="post">
		recipient id:<input type="text" name="recipient_id" value="${form.recipient_id }"/>
		<span style="color: red; font-weight: 900">${errors.recipient_id }</span>
		<br/>
		recipient first name：<input type="text" name="recipient_first_name" value="${form.recipient_first_name }"/>
		<span style="color: red; font-weight: 900">${errors.recipient_first_name }</span>
		<br/>
		recipient last name：<input type="text" name="recipient_last_name" value="${form.recipient_last_name }"/>
		<span style="color: red; font-weight: 900">${errors.recipient_last_name }</span>
		<br/>
		recipient location：<input type="text" name="recipient_location" value="${form.recipient_location }"/>
		<span style="color: red; font-weight: 900">${errors.recipient_location }</span>
		<br/>
		recipient email address：<input type="text" name="recipient_email_address" value="${form.recipient_email_address }"/>
		<span style="color: red; font-weight: 900">${errors.recipient_email_address }</span>
		<br/>
		<input type="submit" value="Create recipient"/>
	</form>
</body>
</html>