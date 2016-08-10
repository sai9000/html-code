
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Watchstreet Admin</title>
<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Watchstreet</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#"><b>Home</b></a></li>
      <li><a href="#"><b>about us</b></a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><b>Categories</b> <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Men</a></li>
          <li><a href="#">women</a></li>
          <li><a href="#">kids</a></li>
        </ul>
      </li>
        <li><a href="Product"><b>Product</b> </a></li>
        <li><a href="#"><b>Brand</b></a></li>
   <li><a href="#"><b>Accessories</b></a></li>

    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Admin"><span class=""></span><b></b></a></li>
      <li><a href="SignUp"><span class=""></span><b></b></a></li>
      <li><a href="#"><span class="#"></span> <b>Logout</b></a></li>
    </ul>
  </div>
</nav>









</head>
<style>
body {
	background-color: #1A5276;
}
</style>
<body>
	<table style="width:100%">

<div class="container">
  
 <tr> 
 <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Categories
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">Add</a></li>
      <li><a href="#">Delete</a></li>
      <li><a href="#">Update</a></li>
 <li><a href="#">View all</a></li>
    </ul>
  </div>
</div></td>

<div class="container">
  
  <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Products
    <span class="caret"></span></button>
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
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Supplier
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">Add</a></li>
      <li><a href="#">Delete</a></li>
      <li><a href="#">Update</a></li>
 <li><a href="#">View all</a></li>
    </ul>
  </div>
</div>
</td>
</tr>
</table>
<br>
<br>
<br>
<br>
<br>
<br>



	<form:form class="form-horizontal" action="productadd"
		commandName="product" method="post">
		<center>
			<table>
				<tr>

					<div class="form-group">
						<label class="control-label col-sm-2" path="name" for="name"><font
							color="white">Product-Name:</font></label>
						<div class="col-sm-5">
							<input type="text" class="form-control" id="name" path="name"
								placeholder="Enter your productname here" required />
						</div>

					</div>

				</tr>
				<div class="form-group">
					<label class="control-label col-sm-2" path="description"
						for="description"><font color="white">Product-Description:</font></label>
					<div class="col-sm-5">
						<input type="text" class="form-control" id="description"
							path="description"
							placeholder="Enter your Product Description here" required />
					</div>

				</div>
                  </tr>


				<tr>
					<td colspan="2"><input type="submit" value="Add Product"></td>

					<td colspan="2"><input type="reset" value="Reset"></td>

				</tr>

			</table>
		</center>
	</form:form>
</html>