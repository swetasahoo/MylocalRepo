<!DOCTYPE html>
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
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Smart Phones at Best Prices</div>
        
        <div class="panel-body"><img src="<c:url value='resources/mobile.jpg'/>" class="img-responsive" width="304" height="236" alt="Image"></div>
        
        <div class="panel-footer"><a href="Product">Shop Now</a></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Best Selling Softwares</div>
        <div class="panel-body"><img src="resources/software.jpg" class="img-responsive" width="304" height="236" alt="Image"></div>
        <div class="panel-footer">Shop Now-></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Manish Malhotra Design</div>
        <div class="panel-body"><img src="<c:url value='resources/saree.jpg'/>" class="img-responsive" width="304" height="236" alt="Image"></div>
        <div class="panel-footer">Start at Rs.799</div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Cotton Double Bedsheets</div>
        <div class="panel-body"><img src="<c:url value='resources/bedsheet.jpg'/>" class="img-responsive" width="304" height="236" alt="Image"></div>
        <div class="panel-footer">Below Rs 499.</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Men's Footwear</div>
        <div class="panel-body"><img src="<c:url value='resources/footwear.jpg'/>" class="img-responsive" width="304" height="236" alt="Image"></div>
        <div class="panel-footer">30-80% off</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Shampoo</div>
        <div class="panel-body"><img src="<c:url value='resources/shampoo.jpg'/>" class="img-responsive" width="304" height="236" alt="Image"></div>
        <div class="panel-footer">Min 20% off</div>
      </div>
    </div>
  </div>
</div><br><br>

<div>
<%@ include file="footer.jsp" %>
</div>

</body>
</html>







