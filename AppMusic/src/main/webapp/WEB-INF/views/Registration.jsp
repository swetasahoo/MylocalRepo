<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  function Validate() {

      var password = document.getElementById("pass").value;

      var confirmPassword = document.getElementById("cpass").value;

      if (password != confirmPassword) {

          alert("Passwords do not match.");

          return false;

      }

      return true;

  }
  </script>
</head>
<body>

<div class="container">
  
  <form:form commandName="user" class="form-horizontal" role="form" action="u_register" method="post">
  <div class="form-group">

  <!--<form:input path="id" readonly="true" size="8"  disabled="true" /> -->
  <form:hidden path="id" />
  </div>
  
    <div class="form-group">
      <form:label class="control-label col-sm-2" path="username">Your Name:</form:label>
      <div class="col-sm-10">
        <form:input path="username"  type="text"  class="form-control" placeholder="Enter Name"/>
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">          
        <form:input path="password" type="password" id="pass" class="form-control"  placeholder="Enter password"/>
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="cpwd">Confirmed Password:</label>
      <div class="col-sm-10">          
        <form:input path="cpassword"  type="password" id="cpass" class="form-control" placeholder="Enter Confirmed password"/>
      </div>
    </div> 
   
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Email:</label>
      <div class="col-sm-10">          
        <form:input path="email" class="form-control"  placeholder="Enter Email"/>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <input type="submit"  value="Register" class="btn btn-default" onclick="return Validate()" />
      </div>
    </div>
  </form:form>
</div>

</body>
</html>
    