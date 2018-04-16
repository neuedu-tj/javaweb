<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>


	<hr>

	<table>
		<tr>
			
			<td>Pname</td>
			<td>Price</td>
			<td>Count</td>
			
			<td>control</td>
		</tr>

		<c:forEach var="item" items="${sessionScope.cart.items}"  varStatus="index">
			<tr>
				
				<td>${item.product.pname }</td>
				<td><fmt:formatNumber value="${item.product.price}" pattern="$0.00"/></td>
				<td>${item.count}</td>
				
				<td>
					<a href="" >modify </a>|
					<a href="" >remove </a>
				</td>
			</tr>
		</c:forEach>

	</table>






</body>
</html>