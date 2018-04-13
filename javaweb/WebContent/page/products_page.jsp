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


	<span>总记录数 : ${pageBean.totalRows}</span> 
	<span> | </span>
	<span>总页数 : ${pageBean.totalPage}</span>
	<span> | </span>
	<span>当前页 : ${pageBean.curr}</span>  

	<hr>

	<table border="1">
		<tr>
			<td>index</td>
			<td>Pname</td>
			<td>price</td>
			<td>desc</td>
			<td>imgs</td>
			<td>control</td>
		</tr>

		<c:forEach var="p" items="${requestScope.pageBean.data }"  varStatus="index">
			<tr>
				<td>${index.count }</td>
				<td>${p.pname }</td>
				<td><fmt:formatNumber value="${p.price}" pattern="$0.00"/></td>
				<td>${p.description} }</td>
				<td>
					<c:forTokens var="img"  items="${p.imgs}"  delims=",">
						<img src="${img}" height="50px" width="50px" >
					</c:forTokens>
				</td>
				<td>modify | remove</td>
			</tr>
		</c:forEach>

	</table>

	<hr>
	
	<c:forEach var="page"   begin="1"  end="${pageBean.totalPage }">
		<a href="${pageContext.request.contextPath}/product?method=getProductByPage&curr=${page}">${page }</a>
		<span> | </span>
	</c:forEach>




</body>
</html>