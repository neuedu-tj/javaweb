<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/product?method=saveProduct" method="post"  enctype="multipart/form-data">
	
		Name : <input type="text" name="pname"> <br>
		Price : <input type="text" name="price"> <br>
		Desc : <input type="text" name="desc"> <br>
		<hr>
		Image : <input type="file" name="imgs"  multiple="multiple"> <br>
		
		<input type="submit"  value="Add">
	</form>
	
</body>
</html>