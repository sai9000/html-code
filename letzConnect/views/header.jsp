<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet"
    href="<c:url value="resources/css/bootstrap.min.css" />" />
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
<link rel="stylesheet"	href="<c:url value="resources/css/bootstrap.min.css" />" />
<script src="<c:url value="resources/js/jquery-2.2.4.js" />"></script>
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>

</head>
<body>

<h1 style="color:red;"><center>Connect- Colloboration Portal</center></h1><hr> --%>
<!-- <!DOCTYPE html>
<html lang="en">
<head>
  <title>letzConnect</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>











</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">LetzConnect</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="welcome">Home</a></li>
        <li class="active"><a href="newblog">Blog</a></li>
        <li class="active"><a href="newforum">Forum</a></li>
          <li><a href="chatpage">Chat</a></li>
    </ul>
  </div>












</nav>
 
 -->
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%-- 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %> --%>

<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Warm Welcome to LetzConnect</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet"
    href="<c:url value="resources/css/bootstrap.min.css" />" />
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
<link rel="stylesheet"	href="<c:url value="resources/css/bootstrap.min.css" />" />
<script src="<c:url value="resources/js/jquery-2.2.4.js" />"></script>
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

 
 <script>document.write('<base href="' + document.location + '" />');</script>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="./resources/css/style.css" rel="stylesheet" media="screen">

<style>
 .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 20%;
      margin: auto;
  }
 h1
 {
 Color:skyblue;
 font-family:Goudy Old Style;
 }
body 
{
background-color: #FFFFFF;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">

   <a class="navbar-brand" href="welcome">LetzConnect</a>
    </div>
    <ul class="nav navbar-nav">
       <li class="active"><a href="welcome">Home</a></li>
       <li class="active"><a href="newblog">Blog</a></li>
        <li class="active"><a href="newforum">Forum</a></li>
          <li><a href="chatpage">Chat</a></li>
       
     
     </ul>
    <ul class="nav navbar-nav navbar-right">

      <c:choose>
					<c:when test="${LoggedIn}">

						<li style="float: right"><a href="perform_logout"
							class="w3-hover-none"><i class="fa fa-sign-out"></i>Logout</a></li>


						<li style="float: right"><a href="#" class="w3-hover-none"><i
								class="fa fa-user"></i> Hi, ${username}</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="SignUp"><span class="glyphicon glyphicon-user"></span><b>SignUp</b></a></li>
						<!-- <li style="float: right"><a href="RegisterPage">Sign up</a></li> -->
						 <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> <b>Login</b></a></li>
						
						<!-- <li style="float: right"><a href="log">Login</a></li> -->
					</c:otherwise>
					</c:choose> 
    </ul>
  </div>
</nav>

