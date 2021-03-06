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
	<h1>Create a location</h1>
	<form action="<c:url value='/LocationServletCreate'/>" method="post">
		location id:<input type="text" name="location_id" value="${form.location_id }"/>
		<span style="color: red; font-weight: 900">${errors.location_id }</span>
		<br/>
		location street name：<input type="text" name="location_street" value="${form.street }"/>
		<span style="color: red; font-weight: 900">${errors.location_street }</span>
		<br/>
		location city name：<input type="text" name="location_city" value="${form.city }"/>
		<span style="color: red; font-weight: 900">${errors.location_city }</span>
		<br/>
		location state name：<input type="text" name="recipient_state" value="${form.state }"/>
		<span style="color: red; font-weight: 900">${errors.location_state }</span>
		<br/>
		location country name：<input type="text" name="location_country" value="${form.country }"/>
		<span style="color: red; font-weight: 900">${errors.location_country }</span>
		<br/>
		<input type="submit" value="Create location"/>
	</form>
</body>
</html>