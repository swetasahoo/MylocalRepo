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

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="#">About</a></li>
        <li><a href="Product">Projects</a></li>
        <li><a href="contact">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
    
    
      <div class="item active">
     
        <img src="<c:url value='resources/image2.jpg'/>" style="width:800px;height:150px"  alt="Image" />
        <div class="carousel-caption">  
        </div>      
      </div>


      <div class="item">
      <img src="<c:url value='resources/img1.jpg'/>" style="width:800px;height:150px"  alt="Image" />
       
        <div class="carousel-caption">  
        </div>        
      </div>
      
      <div class="item">
      <img src="<c:url value='resources/image3.jpg'/>" style="width:800px;height:150px"  alt="Image" />
        
        <div class="carousel-caption">  
        </div>        
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<br>
<br>
<br>
  
<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Smart Phones at Best Prices</div>
        
        <div class="panel-body"><img src="<c:url value='resources/mobile.jpg'/>" class="img-responsive" style="width:150px;height:150px" alt="Image"></div>
        
        <div class="panel-footer">Shop Now</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Best Selling Softwares</div>
        <div class="panel-body"><img src="resources/software.jpg" class="img-responsive" style="width:150px;height:150px" alt="Image"></div>
        <div class="panel-footer">Shop Now-></div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Cotton Double Bedsheets</div>
        <div class="panel-body"><img src="<c:url value='resources/bedsheet.jpg'/>" class="img-responsive" style="width:150px;height:150px" alt="Image"></div>
        <div class="panel-footer">Start at Rs.799</div>
      </div>
    </div>
  </div>
</div><br>


<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>

</body>
</html>







