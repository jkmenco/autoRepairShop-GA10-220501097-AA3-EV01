<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Productos</title>
</head>
<body>
    <h2>Productos disponibles</h2>
    <ul>
        <c:forEach var="p" items="${products}">
            <li>${p.id} - ${p.name} : $${p.price}</li>
        </c:forEach>
    </ul>
</body>
</html>
