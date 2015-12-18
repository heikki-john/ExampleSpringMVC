<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="include.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is view 1! You name is ${nimi}</h1>
        <ol>
            <c:forEach var="item" items="${products}">
                <li>${item.getNimi()} ${item.getHinta()} ${item.getMaara()}</li> 
            </c:forEach>
        </ol>
    </body>
</html>
