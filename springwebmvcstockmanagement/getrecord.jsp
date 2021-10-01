<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>record found</h1>
<table border="1">

		<tr>
			<th>pname</th>
			<th>category</th>
			<th>company</th>
			<th>quantity</th>
			<th>price</th>
			
		</tr>
		<c:forEach var="pdto" items="${lispdto}">
			<tr>
				<td><c:out value="${pdto.getPname()}">      </c:out></td>
				<td><c:out value="${pdto.getCategory()}"> </c:out></td>
				<td><c:out value="${pdto.getCompany()}">    </c:out></td>
				<td><c:out value="${pdto.getQuantity()}">    </c:out></td>
				<td><c:out value="${pdto.getPrice()}">    </c:out></td>
				
			</tr>
		</c:forEach>
	</table>
</html>