
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />
    <script type="text/javascript" src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
    
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
<style>
.itm{
width:70%;
margin: auto;
}


body
{
background-color:#1A5276;
}
</style>

		<title>Admin</title>
	
	<%@include file="Header.jsp" %>
	</head>
	<body>
	
	
	<!--  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WatchStreet</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Products</a></li>
      <li><a href="#">About</a></li> 
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="registration"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>-->
	
	
	
	
	
	 <div align="center">
        <form:form action="productupdation" method="post" commandName="product" modelAttribute="product" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h1 style="color:white"><u>Manage your Products</u></h1></td>
                </tr>
                <tr>
                    <td><h3 style="color:blue">Product name:</td>
                    <td><form:input path="name" /></td>
                </tr>
               
                <tr>
                    <td><h3 style="color:blue">Product description:  </td>
                    <td><form:input path="description" /></td>
                </tr>
             
                  
                 
             	<tr>
                    <td><h3 style="color:blue">Product Image :  </td>
                    <td><form:input type="file" path="image"  /></td>
                </tr>       
       
       
       
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<%@include file="angular.jsp"%>
	<br>
	
	
	
