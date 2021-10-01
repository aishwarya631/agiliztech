<%@ page isELIgnored="false"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update_product" method="post">
  <input type="hidden" name="id" value="${pdto.id}">
 product name: <input type="text" name="pname"  value="${pdto.pname}" ><br><br>
 category: <input type="text" name="category" value="${pdto.category}"><br><br>
 company: <input type="text" name="company" value="${pdto.company}"><br><br>
quantity:<input type="number" name="quantity" value="${pdto.quantity}" ><br><br>
 price:<input type="text" name="price" value="${pdto.price}"><br><br>
 
 <input type="submit" value="update">
</body>
</html>