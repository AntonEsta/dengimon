<%-- 
    Document   : rates
    Created on : Nov 5, 2021, 8:15:10 PM
    Author     : esta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.scheme}://${pageContext.request.serverName}<c:if test="${pageContext.request.serverPort ne '80'}">:${pageContext.request.serverPort}</c:if>/css/main.css"/>
    </head>
    <body>
    <jsp:include page="/main-menu" />
        <p> something </p>
        <c:forEach var="cur" items="${requestScope.rates}">
        <li class="currencies-rate-item-row">${cur.value.currency.numCode} ${cur.value.currency.charCode} ${cur.value.currency.name} ${cur.value.nominal} ${cur.value.amount}</li>
        </c:forEach>
    </body>
</html>
