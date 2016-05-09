<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<align="right">${username}</align>

<table border="1" id="myTable" class="display table" width="100%" >
<tr>
<th>Serial No</td>
<th>Name</th>
<th>Price</th>
<th>Total Quantity</th>
<th>Description</th>
<th>ADD To Cart</th>
</tr>
        <c:forEach items="${listproduct}" var="p">
            <tr>
                <td>${p.ID}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
                <td>${p.description}</td>
                <td><a href="show/${p.ID}">Details</a></td>
            </tr>
        </c:forEach>
    </table>


<%@include file="Footer.jsp"%>
</body>
</html>