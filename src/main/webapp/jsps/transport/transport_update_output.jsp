<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update a transport</title>
    
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
  <h1>Update a transport</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	shipment id:<input type="text" name="shipment_id" value="${transport.shipment_id }" disabled/>

	<br/>
	order id：<input type="text" name="order_id" value="${transport.order_id }" disabled/>

	<br/>
	shipment date：<input type="text" name="shipment_date" value="${transport.shipment_date }" disabled/>

	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/TransportServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="update"/>
	<input type="hidden" name="shipment_id" value="${transport.shipment_id }"/>
	
	order id：<input type="text" name="order_id" value="${form.order_id }" />

	<br/>
	shipment date：<input type="text" name="shipment_date" value="${form.shipment_date }" />

	<br/>
	<input type="submit" value="Update transport"/>
</form>

</body>
</html>
