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
  <h1>Delete a location</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/LocationServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	
	location id:<input type="text" name="location_id" value="${location.location_id }" disabled/>

	<br/>
	location street name：<input type="text" name="location_street" value="${location.street }" disabled/>
	
	<br/>
	location city name：<input type="text" name="location_city" value="${location.city }" disabled/>

	<br/>
	location state name：<input type="text" name="recipient_state" value="${location.state }" disabled/>

	<br/>
	location country name：<input type="text" name="location_country" value="${location.country }" disabled/>

	<br/>
	<input type="submit" value="Delete location"/>
</form>

</body>
</html>
