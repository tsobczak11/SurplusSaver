<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete a recipient</title>
    
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
  <h1>Delete a recipient</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/RecipientServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="recipient_id" value="${recipient.recipient_id }"/>
	Recipient id    :<input type="text" name="recipient_id" value="${recipient.recipient_id }" disabled/>
	<br/>
	
	Recipient first name：<input type="text" name="recipient_first_name" value="${recipient.recipient_first_name }" disabled/>
	<br/>
	Recipient last name	：<input type="text" name="recipient_last_name" value="${recipient.recipient_last_name }" disabled/>
	<br/>
	Recipient location:<input type="text" name="recipient_location" value="${recipient.recipient_location }" disabled />
	<br/>
	Recipient email:<input type="text" name="recipient_email" value="${recipient.recipient_email }" disabled />
	<br />
	<input type="submit" value="Delete recipient"/>
</form>

</body>
</html>
