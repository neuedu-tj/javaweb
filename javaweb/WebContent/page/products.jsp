<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>index</td>
			<td>Pname</td>
			<td>price</td>
			<td>desc</td>
			<td>imgs</td>
			<td>control</td>
		</tr>

		<c:forEach var="p" items="${requestScope.products }"  varStatus="index">
			<tr>
				<td>${index.count }</td>
				<td>${p.pname }</td>
				<td>${p.price} }</td>
				<td>${p.description} }</td>
				<td>
					<img src="${p.imgs }" height="50px" width="50px" >
				</td>
				<td>modify | remove</td>
			</tr>
		</c:forEach>

	</table>






</body>
</html>