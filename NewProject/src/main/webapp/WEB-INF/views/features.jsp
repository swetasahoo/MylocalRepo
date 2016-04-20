<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<%@include file="header.jsp" %>
</div>
  <br>
  <br>
  <div class="container">    
  <div class="row">
  
<br>
<br>
<div class="table-responsive">

<table border="1" id="myTable" class="display table" width="100%" >
<tr>
<th>Serial No</td>
<th>Name</th>
<th>Price</th>
<th>Description</th>
<th>Type</th>
</tr>
        <cr:forEach items="${prod}" var="p">
            <tr>
                <td>${p.ID}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.description}</td>
                       </tr>
        </cr:forEach>
    </table>
    </div>
    </div>
    </div>
    <br><br>

<div>
<%@ include file="footer.jsp" %>
</div>

</body>
</html>
