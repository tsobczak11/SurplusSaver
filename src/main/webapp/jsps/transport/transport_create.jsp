<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create a transport</title>
    
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
  <h1>Create a transport</h1>
<form action="<c:url value='/TransportServletCreate'/>" method="post">
	shipment id:<input type="text" name="shipment_id" value="${form.shipment_id }"/>
	<span style="color: red; font-weight: 900">${errors.shipment_id }</span>
	<br/>
	order id：<input type="text" name="order_id" value="${form.order_id }"/>
	<span style="color: red; font-weight: 900">${errors.order_id }</span>
	<br/>
	shipment date：<input type="text" name="shipment_date" value="${form.shipment_date }"/>
	<span style="color: red; font-weight: 900">${errors.shipment_date }</span>
	<br/>
	<input type="submit" value="Create transport"/>
</form>
  </body>
</html>
