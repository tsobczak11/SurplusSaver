<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete a farm</title>
    
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
  <h1>Delete a farm</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/FarmServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	
	farm id:<input type="text" name="farm_id" value="${farm.farm_id }" disabled/>

	<br/>
	order id：<input type="text" name="order_id" value="${farm.order_id }" disabled/>

	<br/>
	shipment id	：<input type="text" name="shipment_id" value="${farm.shipment_id }" disabled/>

	<br/>
	<input type="submit" value="Delete farm"/>
</form>

</body>
</html>
