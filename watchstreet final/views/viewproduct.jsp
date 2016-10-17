<!DOCTYPE html>
<html lang="en">
<head>
  <title>view product</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script>document.write('<base href="' + document.location + '" />');</script>
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="./resources/css/style.css" rel="stylesheet" media="screen">
    <script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>

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
	.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
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
     <!--  <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-home"></span></a> -->
      <a class="navbar-brand" href="home"><span class="Home"></span></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
       <!--  <li ><a href="viewcust">Viewproducts</a></li> -->
      <li class="active"><a href="home">Home</a></li>
        <li class="active"><a href="viewproduct">viewproduct</a></li>
        
        <li><a href="additem"></a></li>
        <li><a href=""></a></li>
		  <li>&nbsp; &nbsp; &nbsp; &nbsp;</li>
		    
		   <li> <button type="button" class="btn btn-primary btn-s" style="background-color:red"></button></li>
		    <li>&nbsp; &nbsp; &nbsp; &nbsp;</li>
		
		  
      </ul>
    </div>
  </div>
</nav>
<div>
<center><img src="resources/images/pic4.jpg" height="250"width="250"></img></center>
</div>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
Enter Product Name:  <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>Product-Id</th>
    <th>Product-Name</th>
    <th>Product-Description</th>
    <th>Product-Category </th>
    <th>Product-Price</th>
  </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.id}}</td>
            <td>{{ resource.name}}</td>
            <td>{{ resource.description}}</td>
            <td>{{ resource.quantity}}</td>
            <td>{{resource.price}}</td>
           <!--   <td><img src= "${pimg}" height="200" width="300"></td>-->
            <td><a href="view?id={{resource.id}}">view</a></td>
       
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofitem};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>


 <%@include file="Footer.jsp"%>

