<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/jquery-1.9.1.mini.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="font-awesome/css/font-awesome.min.css" />
<script type="text/javascript"
	src="resources/bootstrap/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>

<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>
<style>
.itm {
	width: 70%;
	margin: auto;
}

body {
	background-color: #FFFFFF;
}
</style>

<title>Admin</title>

<%@include file="Header.jsp"%>
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


	<table style="width: 100%">

		<div class="container">

			<tr>
				<td><div class="dropdown">
						<button class="btn btn-primary dropdown-toggle" type="button"
							data-toggle="dropdown">
							Manage Categories <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li><a href="add-category">add-category</a></li>
							<li><a href="#">delete-category</a></li>
							<li><a href="#">update-category</a></li>
							<li><a href="#">view all-category</a></li>
						</ul>
					</div>
		</div>
		</td>

		<div class="container">

			<td><div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						data-toggle="dropdown">
						Manage Products <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="Add">Add</a></li>
						<li><a href="#">Delete</a></li>
						<li><a href="#">Update</a></li>
						<li><a href="#">View all</a></li>
					</ul>
				</div>
		</div>
		</td>

		<div class="container">

			<td><div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						data-toggle="dropdown">
						Manage Supplier <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="addsupplier">add-supplier</a></li>
						<li><a href="#">delete-supplier</a></li>
						<li><a href="#">update-supplier</a></li>
						<li><a href="#">View all-suppliers</a></li>
					</ul>
				</div>
		</div>
		</td>
		</tr>
	</table>

	<div align="center">
		<form:form action="productupdation" method="post"
			commandName="product" modelAttribute="product"
			enctype="multipart/form-data">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h1 style="color: white">
							<u>Manage your Products</u>
						</h1></td>
				</tr>
				<tr>
					<td><h3 style="color: blue">Product name:</td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td><h3 style="color: blue">Product description:</td>
					<td><form:input path="description" /></td>
				</tr>
				<tr>
					<td><h3 style="color: blue">Product price:</td>
					<td><form:input path="price" /></td>
				</tr>

				<tr>
					<td><h3 style="color: blue">Product quantity:</td>
					<td><form:input path="quantity" /></td>
				</tr>


				<tr>
					<td><form:label path="supplier">
							<h2 style="color: blue">Supplied By:
						</form:label></td>
					<td><form:select path="supplier.name" items="${supplierList}"
							itemValue="name" itemLabel="name" /></td>
				</tr>
				<tr>
					<td><form:label path="category">
							<h2 style="color: blue">Category :
						</form:label></td>
					<td><form:select path="category.name" items="${categoryList}"
							itemValue="name" itemLabel="name" /></td>
				</tr>


				<tr>
					<td><h3 style="color: blue">Product Image :</td>
					<td><form:input type="file" path="image" /></td>
				</tr>


				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="submit" /></td>
					<td colspan="2" align="center"><input type="submit"
						value="Reset" /></td>

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
	<%@include file="Footer.jsp"%>