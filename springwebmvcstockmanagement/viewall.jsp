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
<table border="1">
		<tr>
			<th>pname</th>
			<th>category</th>
			<th>company</th>
			<th>quantity</th>
			<th>price</th>
			<th>edit</th>
			<th>delete</th>
			
		</tr>
		<c:forEach var="pdto" items="${lpdtos}">
			<tr>
				<td><c:out value="${pdto.pname}">      </c:out></td>
				<td><c:out value="${pdto.category}"> </c:out></td>
				<td><c:out value="${pdto.company}">    </c:out></td>
				<td><c:out value="${pdto.quantity}">    </c:out></td>
				<td><c:out value="${pdto.price}">    </c:out></td>
				 <td><a href="edit?id=${pdto.id}">edit</a></td>
				<td><a href="delete?id=${pdto.id}">delete</a></td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>