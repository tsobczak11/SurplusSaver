<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete a quantity</title>
    
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
  <h1>Delete a quantity</h1>
<form action="<c:url value='/Entity1ServletDelete'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	Delete quantity   :<input type="text" name="crop_id" value="${form.crop_id }"/>
	<span style="color: red; font-weight: 900">${errors.crop_id }</span>
	<br/>
	<input type="submit" value="Delete quantity"/>
</form>
  </body>
</html>
