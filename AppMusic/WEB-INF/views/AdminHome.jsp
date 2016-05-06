<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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

<div>
<%@include file="header.jsp" %>
</div>
  <br>
  <br>
  <br>
<div class="container">  

<br>
<div class="jumbotron">
  <div class="container text-center">
    <h1>Welcome to Admin Page</h1>        
  </div>
</div>
<br>
<br>
${username}
<a href="admin/manage">Manage Product</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#">Manage User</a>

<br>
<br>
<br>
  
  
<br>
<footer class="container-fluid text-center">
  <%@include file="Footer.jsp"%>
</footer>

</body>
</html>
