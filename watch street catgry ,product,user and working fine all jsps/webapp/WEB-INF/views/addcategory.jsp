<%@include file="Header.jsp"%>
</head>
<body>
<table style="width:100%">

<div class="container">
  
 <tr> 
 <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Categories
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="add-category">add-category</a></li>
      <li><a href="#">delete-category</a></li>
      <li><a href="#">update-category</a></li>
 <li><a href="#">view all-category</a></li>
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
<center>
<form action="updatecategory"method="post">
	
	<h2><b>&nbsp&nbsp&nbsp&nbspAdd Category</b></h2>
	 <br> <b>Category-name:</b> 
				
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="Category-name" required /><br> <br> 


			
				<b>Category-description:&nbsp</b>
			<input type="text" name="Category-description" required /><br> <br>
				
				
			
			
				<input type="submit" value="Submit">&nbsp&nbsp <input type="reset"
				value="Reset">
			
	
	</form>
</center>
</body>
</body>














</html>