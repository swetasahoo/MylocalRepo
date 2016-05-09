<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src = "http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  
  <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" 
href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" 
src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" 
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
    $('#myTable').dataTable();
});

</script>

   <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }
  </style>

</head>
<body>
<%@include file="header.jsp" %>
<div>

</div>
  <br>
  <br>
  <div class="container">    
  <div class="row">
  
<br>
<br>
<div class="table-responsive">

<h1>
    Add a Product
</h1>
 
<c:url var="addAction" value="product/add" ></c:url>
 
<form:form action="${pageContext.request.contextPath}/product/add" commandName="product" enctype="multipart/form-data">

<table>

    <c:if test="${!empty product.name}">
    
    <tr>
        <td>
            <form:label path="ID"><spring:message text="ID"/></form:label>
          
        </td>
        <td>
            <form:input path="ID" readonly="true" size="8"  disabled="true" /><form:hidden path="ID" />
        </td> 
    </tr>
    </c:if>
    <tr>
        <td>
            <form:label path="name"><spring:message text="Name"/></form:label>
        </td>
        <td>
            <form:input path="name"/>
        </td> 
    </tr>
    <tr>
        <td>
            <form:label path="description"><spring:message text="Description"/></form:label>
        </td>
        <td>
            <form:input path="description" />
        </td>
    </tr>
    <tr>
        <td>
            <form:label path="price"><spring:message text="Price"/></form:label>
        </td>
        <td>
            <form:input path="price" />
        </td>
        </tr>
         <tr>
        <td>
            <form:label path="quantity"><spring:message text="Quantity"/></form:label>
        </td>
        <td>
            <form:input path="quantity" />
        </td>
        </tr>
        <tr>
		<td><form:label path="image">Image</form:label></td>
 		<td><form:input type="file" path="image" /></td>
    </tr>
    <br>
    <br>
    <br>
    <tr>
        <td colspan="2">
            <c:if test="${!empty product.name}">
                <input type="submit"
                    value="<spring:message text="Edit Product"/>" />
            </c:if>
            <c:if test="${empty product.name}">
                <input type="submit"
                    value="<spring:message text="Add Product"/>" />
            </c:if>
        </td>
    </tr>
</table>  
</form:form>
<br>
<br>
<br>
<br>

<c:if test="${!empty listproduct}">
<table border="1" id="myTable" class="display table" width="100%" >
<tr>
<th>Serial No</td>
<th>Name</th>
<th>Price</th>
<th>Description</th>
<th>Quantity</th>
<th>Edit</th>
<th>Delete</th>
</tr>
        <c:forEach items="${listproduct}" var="p">
            <tr>
                <td>${p.ID}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.description}</td>
                <td>${p.quantity}</td>
                <td><a href="<c:url value='/edit/${p.ID}' />" >Edit</a></td>
                <td><a href="<c:url value='/remove/${p.ID}' />" >Delete</a></td>
                
            </tr>
        </c:forEach>
    </table>
    </c:if>
    </div>
    </div>
    </div>
    <br><br>

<div>
<%@ include file="Footer.jsp" %>
</div>

</body>
</html>
