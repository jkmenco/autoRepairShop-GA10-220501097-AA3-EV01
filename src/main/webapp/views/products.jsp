<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Productos disponibles</title></head>
<body>
<h2>Productos disponibles</h2>
<ul>
    <c:forEach var="product" items="${products}">
        <li>${product.name} - $${product.price}</li>
    </c:forEach>
</ul>
</body>
</html>
